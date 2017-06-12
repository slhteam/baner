package cn.msec.msc.mysqlgens.admin.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import cn.msec.ojpa.api.annotations.Tab;

@Tab(name="T_SYS_ROLE_MENU")
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleMenu extends SysRoleMenuKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_ROLE_MENU.MENU_ID
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    private Integer menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_ROLE_MENU.ROLE_ID
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_ROLE_MENU.STATUS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_ROLE_MENU.MENU_ID
     *
     * @return the value of T_SYS_ROLE_MENU.MENU_ID
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_ROLE_MENU.MENU_ID
     *
     * @param menuId the value for T_SYS_ROLE_MENU.MENU_ID
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_ROLE_MENU.ROLE_ID
     *
     * @return the value of T_SYS_ROLE_MENU.ROLE_ID
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_ROLE_MENU.ROLE_ID
     *
     * @param roleId the value for T_SYS_ROLE_MENU.ROLE_ID
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_ROLE_MENU.STATUS
     *
     * @return the value of T_SYS_ROLE_MENU.STATUS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_ROLE_MENU.STATUS
     *
     * @param status the value for T_SYS_ROLE_MENU.STATUS
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_MENU
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
        SysRoleMenu other = (SysRoleMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_MENU
     *
     * @mbggenerated Thu Dec 31 10:48:44 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", roleId=").append(roleId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}