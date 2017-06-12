package cn.msec.msc.mysqlgens.admin.entity;

import cn.msec.ojpa.api.annotations.Tab;
import cn.msec.ojpa.msc.mysql.CustomDateSerializer;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="T_SYS_OP_LOGS")
@AllArgsConstructor
@NoArgsConstructor
public class SysOpLogs extends SysOpLogsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_OP_LOGS.SKEYS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    private String skeys;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_OP_LOGS.CONTENTS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    private String contents;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_OP_LOGS.LEVEL1
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    private String level1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_OP_LOGS.CRT_TIME
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    private Date crtTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_OP_LOGS.SKEYS
     *
     * @return the value of T_SYS_OP_LOGS.SKEYS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String getSkeys() {
        return skeys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_OP_LOGS.SKEYS
     *
     * @param skeys the value for T_SYS_OP_LOGS.SKEYS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public void setSkeys(String skeys) {
        this.skeys = skeys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_OP_LOGS.CONTENTS
     *
     * @return the value of T_SYS_OP_LOGS.CONTENTS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String getContents() {
        return contents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_OP_LOGS.CONTENTS
     *
     * @param contents the value for T_SYS_OP_LOGS.CONTENTS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_OP_LOGS.LEVEL1
     *
     * @return the value of T_SYS_OP_LOGS.LEVEL1
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String getLevel1() {
        return level1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_OP_LOGS.LEVEL1
     *
     * @param level1 the value for T_SYS_OP_LOGS.LEVEL1
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_OP_LOGS.CRT_TIME
     *
     * @return the value of T_SYS_OP_LOGS.CRT_TIME
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_OP_LOGS.CRT_TIME
     *
     * @param crtTime the value for T_SYS_OP_LOGS.CRT_TIME
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysOpLogs other = (SysOpLogs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSkeys() == null ? other.getSkeys() == null : this.getSkeys().equals(other.getSkeys()))
            && (this.getContents() == null ? other.getContents() == null : this.getContents().equals(other.getContents()))
            && (this.getLevel1() == null ? other.getLevel1() == null : this.getLevel1().equals(other.getLevel1()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSkeys() == null) ? 0 : getSkeys().hashCode());
        result = prime * result + ((getContents() == null) ? 0 : getContents().hashCode());
        result = prime * result + ((getLevel1() == null) ? 0 : getLevel1().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skeys=").append(skeys);
        sb.append(", contents=").append(contents);
        sb.append(", level1=").append(level1);
        sb.append(", crtTime=").append(crtTime);
        sb.append("]");
        return sb.toString();
    }
}