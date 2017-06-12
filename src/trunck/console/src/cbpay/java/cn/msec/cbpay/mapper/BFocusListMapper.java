package cn.msec.cbpay.mapper;

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

import cn.msec.cbpay.entity.BFocusList;
import cn.msec.cbpay.entity.BFocusListExample;
import cn.msec.cbpay.entity.BFocusListKey;
import cn.msec.ojpa.msc.mysql.StaticTableDaoSupport;

public interface BFocusListMapper extends StaticTableDaoSupport<BFocusList, BFocusListExample, BFocusListKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @SelectProvider(type=BFocusListSqlProvider.class, method="countByExample")
    int countByExample(BFocusListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @DeleteProvider(type=BFocusListSqlProvider.class, method="deleteByExample")
    int deleteByExample(BFocusListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @Delete({
        "delete from B_FOCUS_LIST",
        "where IDTYPE = #{idtype,jdbcType=VARCHAR}",
          "and IDNO = #{idno,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(BFocusListKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @Insert({
        "insert into B_FOCUS_LIST (IDTYPE, IDNO, ",
        "CHNNAME, ENGNAME, ",
        "CREATEDATE)",
        "values (#{idtype,jdbcType=VARCHAR}, #{idno,jdbcType=VARCHAR}, ",
        "#{chnname,jdbcType=VARCHAR}, #{engname,jdbcType=VARCHAR}, ",
        "#{createdate,jdbcType=VARCHAR})"
    })
    int insert(BFocusList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @InsertProvider(type=BFocusListSqlProvider.class, method="insertSelective")
    int insertSelective(BFocusList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @SelectProvider(type=BFocusListSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="IDTYPE", property="idtype", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="IDNO", property="idno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CHNNAME", property="chnname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENGNAME", property="engname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATEDATE", property="createdate", jdbcType=JdbcType.VARCHAR)
    })
    List<BFocusList> selectByExample(BFocusListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @Select({
        "select",
        "IDTYPE, IDNO, CHNNAME, ENGNAME, CREATEDATE",
        "from B_FOCUS_LIST",
        "where IDTYPE = #{idtype,jdbcType=VARCHAR}",
          "and IDNO = #{idno,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="IDTYPE", property="idtype", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="IDNO", property="idno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CHNNAME", property="chnname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENGNAME", property="engname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATEDATE", property="createdate", jdbcType=JdbcType.VARCHAR)
    })
    BFocusList selectByPrimaryKey(BFocusListKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @UpdateProvider(type=BFocusListSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") BFocusList record, @Param("example") BFocusListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @UpdateProvider(type=BFocusListSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") BFocusList record, @Param("example") BFocusListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @UpdateProvider(type=BFocusListSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BFocusList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_FOCUS_LIST
     *
     * @mbggenerated Tue Mar 22 19:36:50 CST 2016
     */
    @Update({
        "update B_FOCUS_LIST",
        "set CHNNAME = #{chnname,jdbcType=VARCHAR},",
          "ENGNAME = #{engname,jdbcType=VARCHAR},",
          "CREATEDATE = #{createdate,jdbcType=VARCHAR}",
        "where IDTYPE = #{idtype,jdbcType=VARCHAR}",
          "and IDNO = #{idno,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(BFocusList record);
}