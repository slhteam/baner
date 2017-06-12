package cn.msec.msc.mysqlgens.admin.mapper;

import cn.msec.msc.mysqlgens.admin.entity.SysRoleAction;
import cn.msec.msc.mysqlgens.admin.entity.SysRoleActionExample;
import cn.msec.msc.mysqlgens.admin.entity.SysRoleActionKey;
import cn.msec.ojpa.msc.mysql.StaticTableDaoSupport;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SysRoleActionMapper extends StaticTableDaoSupport<SysRoleAction, SysRoleActionExample, SysRoleActionKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @SelectProvider(type=SysRoleActionSqlProvider.class, method="countByExample")
    int countByExample(SysRoleActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @DeleteProvider(type=SysRoleActionSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysRoleActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Delete({
        "delete from T_SYS_ROLE_ACTION",
        "where ID = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(SysRoleActionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Insert({
        "insert into T_SYS_ROLE_ACTION (ID, ACTION_ID, ",
        "ROLE_ID, STATUS)",
        "values (#{id,jdbcType=CHAR}, #{actionId,jdbcType=DECIMAL}, ",
        "#{roleId,jdbcType=CHAR}, #{status,jdbcType=DECIMAL})"
    })
    int insert(SysRoleAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @InsertProvider(type=SysRoleActionSqlProvider.class, method="insertSelective")
    int insertSelective(SysRoleAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @SelectProvider(type=SysRoleActionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ACTION_ID", property="actionId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROLE_ID", property="roleId", jdbcType=JdbcType.CHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.DECIMAL)
    })
    List<SysRoleAction> selectByExample(SysRoleActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Select({
        "select",
        "ID, ACTION_ID, ROLE_ID, STATUS",
        "from T_SYS_ROLE_ACTION",
        "where ID = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ACTION_ID", property="actionId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROLE_ID", property="roleId", jdbcType=JdbcType.CHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.DECIMAL)
    })
    SysRoleAction selectByPrimaryKey(SysRoleActionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @UpdateProvider(type=SysRoleActionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysRoleAction record, @Param("example") SysRoleActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @UpdateProvider(type=SysRoleActionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysRoleAction record, @Param("example") SysRoleActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @UpdateProvider(type=SysRoleActionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysRoleAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Update({
        "update T_SYS_ROLE_ACTION",
        "set ACTION_ID = #{actionId,jdbcType=DECIMAL},",
          "ROLE_ID = #{roleId,jdbcType=CHAR},",
          "STATUS = #{status,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(SysRoleAction record);
}