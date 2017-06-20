create or replace procedure switchdatapart
is
-----------------------------------------------------
--���ܣ������������ݱ��ݣ�ɾ�����½�������
--ʱ�䣺2016��6��7��
--���ߣ�zhangxiaoyun
--�汾��v1.0
--
--
------------------------------------------------------
       var_partCount number := 10;      --���ݿ��б����ı���������
       var_dataPartSize number := 40;    --���ݿ���ÿ���������б���n������
       var_dataKeepInterval number :=var_partCount*var_dataPartSize;--���ݿ��б�������������
       var_delDate varchar2(8) ;--��ȡvar_dataKeepInterval��ǰ������
       var_newDate varchar2(8) ;--��ȡvar_dataPartSize��������
       var_newDate2 varchar2(8);--��ȡvar_dataPartSize��������
       var_delDataPartName varchar2(50);
       var_newDataPartName varchar2(50);
       var_count number;
       var_userName varchar2(10) := 'CBPAY';
       var_currentDate varchar2(8);
       var_tableName varchar2(200);
       var_status varchar2(50);
       var_maxPartName varchar2(50);
       var_tableList1 varchar2(200):='b_merchant_order,B_BUY_EXG_CTRL,b_buy_exg_det,b_foreign_currency_rate,B_PAYMENT_FLOW,b_account_transfer_flow,b_sell_exg_ctrl,b_sell_exg_det,b_transfer_file_info,';
       var_tableList2 varchar2(200):='TRANS_LOG,TRANS_MSG_LOG,TRANS_MSG_LOG_STAMP,';
begin
------------------------------��ʼ��ȡ��ǰҵ������--------------------------------
       select acdt into var_currentDate from plat_date_param t ;
       var_delDate :=  to_char(to_date(var_currentDate,'YYYYMMDD')-var_dataKeepInterval,'YYMMDD');
       var_newDate := to_char(to_date(var_currentDate,'YYYYMMDD')+var_dataPartSize,'YYMMDD');
       var_newDate2 := to_char(to_date(var_currentDate,'YYYYMMDD')+var_dataPartSize,'YYYYMMDD');
------------------------------��ʼ����ҵ�������----------------------------------
  while(instr(var_tableList1,',')>0)
  loop
    var_tableName:=substr(var_tableList1,0,instr(var_tableList1,',',1)-1);
    var_tableName:=upper(var_tableName);
    var_tableList1:=substr(var_tableList1,instr(var_tableList1,',',1)+1);
    var_delDataPartName := var_tableName||'_'||var_delDate;
    var_status := '��ʼ����';
    tool_pro(var_currentDate,var_tableName,'','',var_status,'insert');
    --����Ƿ���Ҫɾ��������
    select count(1) into var_count  from all_tab_partitions t where t.table_owner=var_userName and t.table_name=var_tableName and t.partition_name=var_delDataPartName;
    if var_count>0 then
      --�������ݣ�ɾ��������
      var_status := '��ʼ��������';
      tool_pro(var_currentDate,var_tableName,'',var_delDataPartName,var_status,'update');
      execute immediate 'insert into H_'||var_tableName||' select * from '||var_tableName||' partition ('||var_delDataPartName||')';
      --��ʼɾ��������
      var_status := '��ʼɾ��������';
      tool_pro(var_currentDate,var_tableName,'',var_delDataPartName,var_status,'update');
      execute immediate 'alter table '||var_tableName||' drop partition '||var_delDataPartName;
      --����������
      var_status := '��ʼ����������';
      var_newDataPartName:=var_tableName||'_'||var_newDate;
      tool_pro(var_currentDate,var_tableName,var_newDataPartName,var_delDataPartName,var_status,'update');
      var_maxPartName:=var_tableName||'_MAX';
      execute immediate 'alter table '||var_tableName||' drop partition '||var_maxPartName;
      execute immediate 'alter table '||var_tableName||' add partition '||var_newDataPartName||' values less than ('''||var_newDate2||''') tablespace CBPAY_JOURNAL';
      execute immediate 'alter table '||var_tableName||' add partition '||var_maxPartName||' values less than (MAXVALUE) tablespace CBPAY_JOURNAL';

      var_status := '��ɲ���';
      tool_pro(var_currentDate,var_tableName,var_newDataPartName,var_delDataPartName,var_status,'update');

    elsif var_count=0 then
      var_status := '��ɲ��� ����Ҫɾ��������';
      tool_pro(var_currentDate,var_tableName,'',var_delDataPartName,var_status,'update');
    end if;
  end loop;
  ------------------------------����ҵ������ݴ�������----------------------------------

  ------------------------------��ʼ����ƽ̨��־����----------------------------------
  while(instr(var_tableList2,',')>0)
  loop
    var_tableName:=substr(var_tableList2,0,instr(var_tableList2,',',1)-1);
    var_tableName:=upper(var_tableName);
    var_tableList2:=substr(var_tableList2,instr(var_tableList2,',',1)+1);
    var_delDataPartName := var_tableName||'_'||var_delDate;
    var_status := '��ʼ����';
    tool_pro(var_currentDate,var_tableName,'','',var_status,'insert');
    --����Ƿ���Ҫɾ��������
    select count(1) into var_count  from all_tab_partitions t where t.table_owner=var_userName and t.table_name=var_tableName and t.partition_name=var_delDataPartName;
    if var_count>0 then
      --��ʼɾ��������
      var_status := '��ʼɾ��������';
      tool_pro(var_currentDate,var_tableName,'',var_delDataPartName,var_status,'update');
      execute immediate 'alter table '||var_tableName||' drop partition '||var_delDataPartName;
      --����������
      var_status := '��ʼ����������';
      var_newDataPartName:=var_tableName||'_'||var_newDate;
      tool_pro(var_currentDate,var_tableName,var_newDataPartName,var_delDataPartName,var_status,'update');
      var_maxPartName:=var_tableName||'_MAX';
      execute immediate 'alter table '||var_tableName||' drop partition '||var_maxPartName;
      execute immediate 'alter table '||var_tableName||' add partition '||var_newDataPartName||' values less than ('''||var_newDate2||''') tablespace CBPAY_JOURNAL';
      execute immediate 'alter table '||var_tableName||' add partition '||var_maxPartName||' values less than (MAXVALUE) tablespace CBPAY_JOURNAL';

      var_status := '��ɲ���';
      tool_pro(var_currentDate,var_tableName,var_newDataPartName,var_delDataPartName,var_status,'update');

    elsif var_count=0 then
      var_status := '��ɲ��� ����Ҫɾ��������';
      tool_pro(var_currentDate,var_tableName,'',var_delDataPartName,var_status,'update');
    end if;
  end loop;
  ------------------------------ƽ̨��־�������----------------------------------
  exception
    when OTHERS then
      errorlog_pro(var_currentDate,'switchdatapart',SQLCODE,SQLERRM,dbms_utility.format_error_backtrace);
      RAISE;
end switchdatapart;
/