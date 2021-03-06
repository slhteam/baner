package cn.msec.cbpay.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import cn.msec.ojpa.api.annotations.Tab;

@Tab(name="B_USER_INFO")
@AllArgsConstructor
@NoArgsConstructor
public class BUserInfo extends BUserInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.NICKNAME
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.USRSTS
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String usrsts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.REALNMFLG
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String realnmflg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.REALNAME
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String realname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.IDTYP
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String idtyp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.IDNO
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String idno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.REGDATE
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String regdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.REGTIME
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String regtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.REGCHNL
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String regchnl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.EMAIL
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.TMSMP
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String tmsmp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_USER_INFO.TELNUM
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    private String telnum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.NICKNAME
     *
     * @return the value of B_USER_INFO.NICKNAME
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.NICKNAME
     *
     * @param nickname the value for B_USER_INFO.NICKNAME
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.USRSTS
     *
     * @return the value of B_USER_INFO.USRSTS
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getUsrsts() {
        return usrsts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.USRSTS
     *
     * @param usrsts the value for B_USER_INFO.USRSTS
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setUsrsts(String usrsts) {
        this.usrsts = usrsts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.REALNMFLG
     *
     * @return the value of B_USER_INFO.REALNMFLG
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getRealnmflg() {
        return realnmflg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.REALNMFLG
     *
     * @param realnmflg the value for B_USER_INFO.REALNMFLG
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setRealnmflg(String realnmflg) {
        this.realnmflg = realnmflg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.REALNAME
     *
     * @return the value of B_USER_INFO.REALNAME
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.REALNAME
     *
     * @param realname the value for B_USER_INFO.REALNAME
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.IDTYP
     *
     * @return the value of B_USER_INFO.IDTYP
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getIdtyp() {
        return idtyp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.IDTYP
     *
     * @param idtyp the value for B_USER_INFO.IDTYP
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setIdtyp(String idtyp) {
        this.idtyp = idtyp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.IDNO
     *
     * @return the value of B_USER_INFO.IDNO
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getIdno() {
        return idno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.IDNO
     *
     * @param idno the value for B_USER_INFO.IDNO
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setIdno(String idno) {
        this.idno = idno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.REGDATE
     *
     * @return the value of B_USER_INFO.REGDATE
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getRegdate() {
        return regdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.REGDATE
     *
     * @param regdate the value for B_USER_INFO.REGDATE
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.REGTIME
     *
     * @return the value of B_USER_INFO.REGTIME
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getRegtime() {
        return regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.REGTIME
     *
     * @param regtime the value for B_USER_INFO.REGTIME
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.REGCHNL
     *
     * @return the value of B_USER_INFO.REGCHNL
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getRegchnl() {
        return regchnl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.REGCHNL
     *
     * @param regchnl the value for B_USER_INFO.REGCHNL
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setRegchnl(String regchnl) {
        this.regchnl = regchnl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.EMAIL
     *
     * @return the value of B_USER_INFO.EMAIL
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.EMAIL
     *
     * @param email the value for B_USER_INFO.EMAIL
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.TMSMP
     *
     * @return the value of B_USER_INFO.TMSMP
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getTmsmp() {
        return tmsmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.TMSMP
     *
     * @param tmsmp the value for B_USER_INFO.TMSMP
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setTmsmp(String tmsmp) {
        this.tmsmp = tmsmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_USER_INFO.TELNUM
     *
     * @return the value of B_USER_INFO.TELNUM
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public String getTelnum() {
        return telnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_USER_INFO.TELNUM
     *
     * @param telnum the value for B_USER_INFO.TELNUM
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_USER_INFO
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
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
        BUserInfo other = (BUserInfo) that;
        return (this.getPurchaserid() == null ? other.getPurchaserid() == null : this.getPurchaserid().equals(other.getPurchaserid()))
            && (this.getMerchantid() == null ? other.getMerchantid() == null : this.getMerchantid().equals(other.getMerchantid()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getUsrsts() == null ? other.getUsrsts() == null : this.getUsrsts().equals(other.getUsrsts()))
            && (this.getRealnmflg() == null ? other.getRealnmflg() == null : this.getRealnmflg().equals(other.getRealnmflg()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getIdtyp() == null ? other.getIdtyp() == null : this.getIdtyp().equals(other.getIdtyp()))
            && (this.getIdno() == null ? other.getIdno() == null : this.getIdno().equals(other.getIdno()))
            && (this.getRegdate() == null ? other.getRegdate() == null : this.getRegdate().equals(other.getRegdate()))
            && (this.getRegtime() == null ? other.getRegtime() == null : this.getRegtime().equals(other.getRegtime()))
            && (this.getRegchnl() == null ? other.getRegchnl() == null : this.getRegchnl().equals(other.getRegchnl()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getTmsmp() == null ? other.getTmsmp() == null : this.getTmsmp().equals(other.getTmsmp()))
            && (this.getTelnum() == null ? other.getTelnum() == null : this.getTelnum().equals(other.getTelnum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_USER_INFO
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPurchaserid() == null) ? 0 : getPurchaserid().hashCode());
        result = prime * result + ((getMerchantid() == null) ? 0 : getMerchantid().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getUsrsts() == null) ? 0 : getUsrsts().hashCode());
        result = prime * result + ((getRealnmflg() == null) ? 0 : getRealnmflg().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getIdtyp() == null) ? 0 : getIdtyp().hashCode());
        result = prime * result + ((getIdno() == null) ? 0 : getIdno().hashCode());
        result = prime * result + ((getRegdate() == null) ? 0 : getRegdate().hashCode());
        result = prime * result + ((getRegtime() == null) ? 0 : getRegtime().hashCode());
        result = prime * result + ((getRegchnl() == null) ? 0 : getRegchnl().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getTmsmp() == null) ? 0 : getTmsmp().hashCode());
        result = prime * result + ((getTelnum() == null) ? 0 : getTelnum().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_USER_INFO
     *
     * @mbggenerated Wed Mar 23 17:39:39 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nickname=").append(nickname);
        sb.append(", usrsts=").append(usrsts);
        sb.append(", realnmflg=").append(realnmflg);
        sb.append(", realname=").append(realname);
        sb.append(", idtyp=").append(idtyp);
        sb.append(", idno=").append(idno);
        sb.append(", regdate=").append(regdate);
        sb.append(", regtime=").append(regtime);
        sb.append(", regchnl=").append(regchnl);
        sb.append(", email=").append(email);
        sb.append(", tmsmp=").append(tmsmp);
        sb.append(", telnum=").append(telnum);
        sb.append("]");
        return sb.toString();
    }
}