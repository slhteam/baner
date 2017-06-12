package cn.msec.msc.mysqlgens.admin.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;


import lombok.Data;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.transaction.annotation.Transactional;

import cn.msec.msc.mysqlgens.admin.entity.SysRoleMenu;
import cn.msec.msc.mysqlgens.admin.entity.SysRoleMenuExample;
import cn.msec.msc.mysqlgens.admin.entity.SysRoleMenuExample.Criteria;
import cn.msec.msc.mysqlgens.admin.entity.SysRoleMenuKey;
import cn.msec.msc.mysqlgens.admin.mapper.SysRoleMenuMapper;
import cn.msec.ojpa.annotations.Tab;
import cn.msec.ojpa.msc.mysql.StaticTableDaoSupport;


@Data
@Tab(name="T_SYS_ROLE_MENU")
public class SysRoleMenuDao implements StaticTableDaoSupport<SysRoleMenu, SysRoleMenuExample, SysRoleMenuKey>{

	private SysRoleMenuMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(SysRoleMenuExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SysRoleMenuExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(SysRoleMenuKey key) {
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(SysRoleMenu record)  {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(SysRoleMenu record)  {
		return mapper.insertSelective(record);
	}

	@Override
	@Transactional
	public int batchUpdate(List<SysRoleMenu> records)
			 {
		for(SysRoleMenu record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	@Transactional
	public int batchDelete(List<SysRoleMenu> records)
			 {
		for(SysRoleMenu record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<SysRoleMenu> selectByExample(SysRoleMenuExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public SysRoleMenu selectByPrimaryKey(SysRoleMenuKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<SysRoleMenu> findAll(List<SysRoleMenu> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new SysRoleMenuExample());
		}
		List<SysRoleMenu> list = new ArrayList<>();
		for(SysRoleMenu record : records){
			SysRoleMenu result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(SysRoleMenu record, SysRoleMenuExample example)  {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SysRoleMenu record, SysRoleMenuExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SysRoleMenu record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysRoleMenu record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(SysRoleMenuExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  {
		mapper.deleteByExample(new SysRoleMenuExample());
	}

	@Override
	public SysRoleMenuExample getExample(SysRoleMenu record) {
		SysRoleMenuExample example = new SysRoleMenuExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getId()!=null){
				criteria.andIdEqualTo(record.getId());
				}
				if(record.getMenuId()!=null){
				criteria.andMenuIdEqualTo(record.getMenuId());
				}
				if(record.getRoleId()!=null){
				criteria.andRoleIdEqualTo(record.getRoleId());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}

		}
		return example;
	}
	
	
	@Override
	@Transactional
	public int batchInsert(List<SysRoleMenu> records) {
	    if(records.size()==1){
	    	//return insert(records.get(0));
	    }
		SqlSession session=sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		int result=0;
		try {
			conn.setAutoCommit(false);
			
			Statement st = conn.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO T_SYS_ROLE_MENU() values");
			int i=0;
			for (SysRoleMenu record : records) {
				if(i>0){
					sb.append(",");
				}
				i++;
				
			
				sb.append("(");
			
				if(record.getId()==null){
						sb.append("null");
				}else{
				    Object o=record.getId();
					if (o instanceof Date) {
						SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						sb.append("'" + sf.format(record.getId()) + "'");
					} else {
						sb.append("'" + record.getId() + "'");
					}
				}
			
				sb.append(",");
			
				if(record.getMenuId()==null){
						sb.append("'"+"NULL"+"'");						
				}else{
				    Object o=record.getMenuId();
					if (o instanceof Date) {
						SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						sb.append("'" + sf.format(record.getMenuId()) + "'");
					} else {
						sb.append("'" + record.getMenuId() + "'");
					}
				}
			
				sb.append(",");
			
				if(record.getRoleId()==null){
						sb.append("'"+"NULL"+"'");						
				}else{
				    Object o=record.getRoleId();
					if (o instanceof Date) {
						SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						sb.append("'" + sf.format(record.getRoleId()) + "'");
					} else {
						sb.append("'" + record.getRoleId() + "'");
					}
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("'"+"NULL"+"'");						
				}else{
				    Object o=record.getStatus();
					if (o instanceof Date) {
						SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						sb.append("'" + sf.format(record.getStatus()) + "'");
					} else {
						sb.append("'" + record.getStatus() + "'");
					}
				}
							sb.append(")");
			
			}
			result=st.executeUpdate(sb.toString());
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new RuntimeException(e);
		}finally{
			session.close();
		}
		return result;
	}
	
	
}
