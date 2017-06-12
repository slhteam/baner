package cn.msec.cbpay.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import cn.msec.ojpa.api.annotations.Tab;

@Tab(name="B_CHECK_STATUS")
@AllArgsConstructor
@NoArgsConstructor
public class BCheckStatus extends BCheckStatusKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_CHECK_STATUS.ACCOUNTDATE
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    private String accountdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_CHECK_STATUS.STATUS
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_CHECK_STATUS.TRANTIME
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    private String trantime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_CHECK_STATUS.FILENAME
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    private String filename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_CHECK_STATUS.TMSMP
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    //private Date tmsmp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_CHECK_STATUS.JNLNO
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    private String jnlno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_CHECK_STATUS.CHECKNL
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    private String checknl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_CHECK_STATUS.ISHANDLED
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    private String ishandled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_CHECK_STATUS.ACCOUNTDATE
     *
     * @return the value of B_CHECK_STATUS.ACCOUNTDATE
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public String getAccountdate() {
        return accountdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_CHECK_STATUS.ACCOUNTDATE
     *
     * @param accountdate the value for B_CHECK_STATUS.ACCOUNTDATE
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public void setAccountdate(String accountdate) {
        this.accountdate = accountdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_CHECK_STATUS.STATUS
     *
     * @return the value of B_CHECK_STATUS.STATUS
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_CHECK_STATUS.STATUS
     *
     * @param status the value for B_CHECK_STATUS.STATUS
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_CHECK_STATUS.TRANTIME
     *
     * @return the value of B_CHECK_STATUS.TRANTIME
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public String getTrantime() {
        return trantime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_CHECK_STATUS.TRANTIME
     *
     * @param trantime the value for B_CHECK_STATUS.TRANTIME
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public void setTrantime(String trantime) {
        this.trantime = trantime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_CHECK_STATUS.FILENAME
     *
     * @return the value of B_CHECK_STATUS.FILENAME
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_CHECK_STATUS.FILENAME
     *
     * @param filename the value for B_CHECK_STATUS.FILENAME
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_CHECK_STATUS.TMSMP
     *
     * @return the value of B_CHECK_STATUS.TMSMP
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
//    @JsonSerialize(using = CustomDateSerializer.class)
//    public Date getTmsmp() {
//        return tmsmp;
//    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_CHECK_STATUS.TMSMP
     *
     * @param tmsmp the value for B_CHECK_STATUS.TMSMP
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
//    public void setTmsmp(Date tmsmp) {
//        this.tmsmp = tmsmp;
//    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_CHECK_STATUS.JNLNO
     *
     * @return the value of B_CHECK_STATUS.JNLNO
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public String getJnlno() {
        return jnlno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_CHECK_STATUS.JNLNO
     *
     * @param jnlno the value for B_CHECK_STATUS.JNLNO
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public void setJnlno(String jnlno) {
        this.jnlno = jnlno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_CHECK_STATUS.CHECKNL
     *
     * @return the value of B_CHECK_STATUS.CHECKNL
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public String getChecknl() {
        return checknl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_CHECK_STATUS.CHECKNL
     *
     * @param checknl the value for B_CHECK_STATUS.CHECKNL
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public void setChecknl(String checknl) {
        this.checknl = checknl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_CHECK_STATUS.ISHANDLED
     *
     * @return the value of B_CHECK_STATUS.ISHANDLED
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public String getIshandled() {
        return ishandled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_CHECK_STATUS.ISHANDLED
     *
     * @param ishandled the value for B_CHECK_STATUS.ISHANDLED
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    public void setIshandled(String ishandled) {
        this.ishandled = ishandled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_CHECK_STATUS
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
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
        BCheckStatus other = (BCheckStatus) that;
        return (this.getTrandate() == null ? other.getTrandate() == null : this.getTrandate().equals(other.getTrandate()))
            && (this.getChecktype() == null ? other.getChecktype() == null : this.getChecktype().equals(other.getChecktype()))
            && (this.getAccountdate() == null ? other.getAccountdate() == null : this.getAccountdate().equals(other.getAccountdate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTrantime() == null ? other.getTrantime() == null : this.getTrantime().equals(other.getTrantime()))
            && (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()))
           // && (this.getTmsmp() == null ? other.getTmsmp() == null : this.getTmsmp().equals(other.getTmsmp()))
            && (this.getJnlno() == null ? other.getJnlno() == null : this.getJnlno().equals(other.getJnlno()))
            && (this.getChecknl() == null ? other.getChecknl() == null : this.getChecknl().equals(other.getChecknl()))
            && (this.getIshandled() == null ? other.getIshandled() == null : this.getIshandled().equals(other.getIshandled()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_CHECK_STATUS
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrandate() == null) ? 0 : getTrandate().hashCode());
        result = prime * result + ((getChecktype() == null) ? 0 : getChecktype().hashCode());
        result = prime * result + ((getAccountdate() == null) ? 0 : getAccountdate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTrantime() == null) ? 0 : getTrantime().hashCode());
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
       // result = prime * result + ((getTmsmp() == null) ? 0 : getTmsmp().hashCode());
        result = prime * result + ((getJnlno() == null) ? 0 : getJnlno().hashCode());
        result = prime * result + ((getChecknl() == null) ? 0 : getChecknl().hashCode());
        result = prime * result + ((getIshandled() == null) ? 0 : getIshandled().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_CHECK_STATUS
     *
     * @mbggenerated Mon Jun 13 09:11:20 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountdate=").append(accountdate);
        sb.append(", status=").append(status);
        sb.append(", trantime=").append(trantime);
        sb.append(", filename=").append(filename);
       // sb.append(", tmsmp=").append(tmsmp);
        sb.append(", jnlno=").append(jnlno);
        sb.append(", checknl=").append(checknl);
        sb.append(", ishandled=").append(ishandled);
        sb.append("]");
        return sb.toString();
    }
}