package cn.msec.msc.mysqlgens.admin.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.msec.msc.mysqlgens.admin.entity.SysRoleAction;
import cn.msec.msc.mysqlgens.admin.entity.SysRoleActionExample.Criteria;
import cn.msec.msc.mysqlgens.admin.entity.SysRoleActionExample.Criterion;
import cn.msec.msc.mysqlgens.admin.entity.SysRoleActionExample;
import java.util.List;
import java.util.Map;

public class SysRoleActionSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String countByExample(SysRoleActionExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("T_SYS_ROLE_ACTION");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String deleteByExample(SysRoleActionExample example) {
        BEGIN();
        DELETE_FROM("T_SYS_ROLE_ACTION");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String insertSelective(SysRoleAction record) {
        BEGIN();
        INSERT_INTO("T_SYS_ROLE_ACTION");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=CHAR}");
        }
        
        if (record.getActionId() != null) {
            VALUES("ACTION_ID", "#{actionId,jdbcType=DECIMAL}");
        }
        
        if (record.getRoleId() != null) {
            VALUES("ROLE_ID", "#{roleId,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("STATUS", "#{status,jdbcType=DECIMAL}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String selectByExample(SysRoleActionExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        SELECT("ACTION_ID");
        SELECT("ROLE_ID");
        SELECT("STATUS");
        FROM("T_SYS_ROLE_ACTION");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        if(example != null){
        }
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        SysRoleAction record = (SysRoleAction) parameter.get("record");
        SysRoleActionExample example = (SysRoleActionExample) parameter.get("example");
        
        BEGIN();
        UPDATE("T_SYS_ROLE_ACTION");
        
        if (record.getId() != null) {
            SET("ID = #{record.id,jdbcType=CHAR}");
        }
        
        if (record.getActionId() != null) {
            SET("ACTION_ID = #{record.actionId,jdbcType=DECIMAL}");
        }
        
        if (record.getRoleId() != null) {
            SET("ROLE_ID = #{record.roleId,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{record.status,jdbcType=DECIMAL}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("T_SYS_ROLE_ACTION");
        
        SET("ID = #{record.id,jdbcType=CHAR}");
        SET("ACTION_ID = #{record.actionId,jdbcType=DECIMAL}");
        SET("ROLE_ID = #{record.roleId,jdbcType=CHAR}");
        SET("STATUS = #{record.status,jdbcType=DECIMAL}");
        
        SysRoleActionExample example = (SysRoleActionExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String updateByPrimaryKeySelective(SysRoleAction record) {
        BEGIN();
        UPDATE("T_SYS_ROLE_ACTION");
        
        if (record.getActionId() != null) {
            SET("ACTION_ID = #{actionId,jdbcType=DECIMAL}");
        }
        
        if (record.getRoleId() != null) {
            SET("ROLE_ID = #{roleId,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{status,jdbcType=DECIMAL}");
        }
        
        WHERE("ID = #{id,jdbcType=CHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    protected void applyWhere(SysRoleActionExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}