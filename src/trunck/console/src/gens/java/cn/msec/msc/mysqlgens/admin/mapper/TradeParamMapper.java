package cn.msec.msc.mysqlgens.admin.mapper;

import cn.msec.msc.mysqlgens.admin.entity.TradeParam;
import cn.msec.msc.mysqlgens.admin.entity.TradeParamExample;
import cn.msec.msc.mysqlgens.admin.entity.TradeParamKey;
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

public interface TradeParamMapper extends StaticTableDaoSupport<TradeParam, TradeParamExample, TradeParamKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @SelectProvider(type=TradeParamSqlProvider.class, method="countByExample")
    int countByExample(TradeParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @DeleteProvider(type=TradeParamSqlProvider.class, method="deleteByExample")
    int deleteByExample(TradeParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Delete({
        "delete from T_TRADE_PARAM",
        "where PARAM_ID = #{paramId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TradeParamKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Insert({
        "insert into T_TRADE_PARAM (PARAM_ID, PARAM_TYPE, ",
        "PARAM_VALUE, DSC, ",
        "CRT_TIME, FIELD1, ",
        "FIELD2, FIELD3)",
        "values (#{paramId,jdbcType=VARCHAR}, #{paramType,jdbcType=VARCHAR}, ",
        "#{paramValue,jdbcType=VARCHAR}, #{dsc,jdbcType=VARCHAR}, ",
        "#{crtTime,jdbcType=VARCHAR}, #{field1,jdbcType=VARCHAR}, ",
        "#{field2,jdbcType=VARCHAR}, #{field3,jdbcType=VARCHAR})"
    })
    int insert(TradeParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @InsertProvider(type=TradeParamSqlProvider.class, method="insertSelective")
    int insertSelective(TradeParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @SelectProvider(type=TradeParamSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="PARAM_ID", property="paramId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PARAM_TYPE", property="paramType", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARAM_VALUE", property="paramValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="DSC", property="dsc", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_TIME", property="crtTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIELD1", property="field1", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIELD2", property="field2", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIELD3", property="field3", jdbcType=JdbcType.VARCHAR)
    })
    List<TradeParam> selectByExample(TradeParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Select({
        "select",
        "PARAM_ID, PARAM_TYPE, PARAM_VALUE, DSC, CRT_TIME, FIELD1, FIELD2, FIELD3",
        "from T_TRADE_PARAM",
        "where PARAM_ID = #{paramId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="PARAM_ID", property="paramId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PARAM_TYPE", property="paramType", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARAM_VALUE", property="paramValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="DSC", property="dsc", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_TIME", property="crtTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIELD1", property="field1", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIELD2", property="field2", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIELD3", property="field3", jdbcType=JdbcType.VARCHAR)
    })
    TradeParam selectByPrimaryKey(TradeParamKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @UpdateProvider(type=TradeParamSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TradeParam record, @Param("example") TradeParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @UpdateProvider(type=TradeParamSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TradeParam record, @Param("example") TradeParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @UpdateProvider(type=TradeParamSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TradeParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_PARAM
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Update({
        "update T_TRADE_PARAM",
        "set PARAM_TYPE = #{paramType,jdbcType=VARCHAR},",
          "PARAM_VALUE = #{paramValue,jdbcType=VARCHAR},",
          "DSC = #{dsc,jdbcType=VARCHAR},",
          "CRT_TIME = #{crtTime,jdbcType=VARCHAR},",
          "FIELD1 = #{field1,jdbcType=VARCHAR},",
          "FIELD2 = #{field2,jdbcType=VARCHAR},",
          "FIELD3 = #{field3,jdbcType=VARCHAR}",
        "where PARAM_ID = #{paramId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TradeParam record);
}