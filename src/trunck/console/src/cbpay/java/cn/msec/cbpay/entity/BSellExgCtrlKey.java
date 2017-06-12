package cn.msec.cbpay.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BSellExgCtrlKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_SELL_EXG_CTRL.PAYBATNO
     *
     * @mbggenerated Thu May 05 14:51:53 CST 2016
     */
    private String paybatno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column B_SELL_EXG_CTRL.PAYDATE
     *
     * @mbggenerated Thu May 05 14:51:53 CST 2016
     */
    private String paydate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_SELL_EXG_CTRL.PAYBATNO
     *
     * @return the value of B_SELL_EXG_CTRL.PAYBATNO
     *
     * @mbggenerated Thu May 05 14:51:53 CST 2016
     */
    public String getPaybatno() {
        return paybatno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_SELL_EXG_CTRL.PAYBATNO
     *
     * @param paybatno the value for B_SELL_EXG_CTRL.PAYBATNO
     *
     * @mbggenerated Thu May 05 14:51:53 CST 2016
     */
    public void setPaybatno(String paybatno) {
        this.paybatno = paybatno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column B_SELL_EXG_CTRL.PAYDATE
     *
     * @return the value of B_SELL_EXG_CTRL.PAYDATE
     *
     * @mbggenerated Thu May 05 14:51:53 CST 2016
     */
    public String getPaydate() {
        return paydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column B_SELL_EXG_CTRL.PAYDATE
     *
     * @param paydate the value for B_SELL_EXG_CTRL.PAYDATE
     *
     * @mbggenerated Thu May 05 14:51:53 CST 2016
     */
    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_SELL_EXG_CTRL
     *
     * @mbggenerated Thu May 05 14:51:53 CST 2016
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
        BSellExgCtrlKey other = (BSellExgCtrlKey) that;
        return (this.getPaybatno() == null ? other.getPaybatno() == null : this.getPaybatno().equals(other.getPaybatno()))
            && (this.getPaydate() == null ? other.getPaydate() == null : this.getPaydate().equals(other.getPaydate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_SELL_EXG_CTRL
     *
     * @mbggenerated Thu May 05 14:51:53 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaybatno() == null) ? 0 : getPaybatno().hashCode());
        result = prime * result + ((getPaydate() == null) ? 0 : getPaydate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B_SELL_EXG_CTRL
     *
     * @mbggenerated Thu May 05 14:51:53 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paybatno=").append(paybatno);
        sb.append(", paydate=").append(paydate);
        sb.append("]");
        return sb.toString();
    }
}