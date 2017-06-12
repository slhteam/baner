package cn.msec.msc.mysqlgens.admin.mapper;

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

import cn.msec.msc.mysqlgens.admin.entity.SysMenu;
import cn.msec.msc.mysqlgens.admin.entity.SysMenuExample;
import cn.msec.msc.mysqlgens.admin.entity.SysMenuKey;
import cn.msec.ojpa.msc.mysql.StaticTableDaoSupport;

public interface SysMenuMapper extends StaticTableDaoSupport<SysMenu, SysMenuExample, SysMenuKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @SelectProvider(type=SysMenuSqlProvider.class, method="countByExample")
    int countByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @DeleteProvider(type=SysMenuSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Delete({
        "delete from T_SYS_MENU",
        "where MENU_ID = #{menuId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(SysMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Insert({
        "insert into T_SYS_MENU (MENU_ID, MENU_NAME, ",
        "MENU_DESC, MENU_SEQ, ",
        "MENU_URL, PARENT_ID, ",
        "LEAF_FLAG, LEVEL1, ",
        "ICON)",
        "values (#{menuId,jdbcType=DECIMAL}, #{menuName,jdbcType=VARCHAR}, ",
        "#{menuDesc,jdbcType=VARCHAR}, #{menuSeq,jdbcType=DECIMAL}, ",
        "#{menuUrl,jdbcType=VARCHAR}, #{parentId,jdbcType=DECIMAL}, ",
        "#{leafFlag,jdbcType=DECIMAL}, #{level1,jdbcType=DECIMAL}, ",
        "#{icon,jdbcType=VARCHAR})"
    })
    int insert(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @InsertProvider(type=SysMenuSqlProvider.class, method="insertSelective")
    int insertSelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @SelectProvider(type=SysMenuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="MENU_ID", property="menuId", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="MENU_NAME", property="menuName", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_DESC", property="menuDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_SEQ", property="menuSeq", jdbcType=JdbcType.DECIMAL),
        @Result(column="MENU_URL", property="menuUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT_ID", property="parentId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LEAF_FLAG", property="leafFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="LEVEL1", property="level1", jdbcType=JdbcType.DECIMAL),
        @Result(column="ICON", property="icon", jdbcType=JdbcType.VARCHAR)
    })
    List<SysMenu> selectByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Select({
        "select",
        "MENU_ID, MENU_NAME, MENU_DESC, MENU_SEQ, MENU_URL, PARENT_ID, LEAF_FLAG, LEVEL1, ",
        "ICON",
        "from T_SYS_MENU",
        "where MENU_ID = #{menuId,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="MENU_ID", property="menuId", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="MENU_NAME", property="menuName", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_DESC", property="menuDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_SEQ", property="menuSeq", jdbcType=JdbcType.DECIMAL),
        @Result(column="MENU_URL", property="menuUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT_ID", property="parentId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LEAF_FLAG", property="leafFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="LEVEL1", property="level1", jdbcType=JdbcType.DECIMAL),
        @Result(column="ICON", property="icon", jdbcType=JdbcType.VARCHAR)
    })
    SysMenu selectByPrimaryKey(SysMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @UpdateProvider(type=SysMenuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @UpdateProvider(type=SysMenuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @UpdateProvider(type=SysMenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Update({
        "update T_SYS_MENU",
        "set MENU_NAME = #{menuName,jdbcType=VARCHAR},",
          "MENU_DESC = #{menuDesc,jdbcType=VARCHAR},",
          "MENU_SEQ = #{menuSeq,jdbcType=DECIMAL},",
          "MENU_URL = #{menuUrl,jdbcType=VARCHAR},",
          "PARENT_ID = #{parentId,jdbcType=DECIMAL},",
          "LEAF_FLAG = #{leafFlag,jdbcType=DECIMAL},",
          "LEVEL1 = #{level1,jdbcType=DECIMAL},",
          "ICON = #{icon,jdbcType=VARCHAR}",
        "where MENU_ID = #{menuId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(SysMenu record);
}