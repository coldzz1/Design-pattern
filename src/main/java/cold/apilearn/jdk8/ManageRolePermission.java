package cold.apilearn.jdk8;



public class ManageRolePermission  {
    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 菜单ID
     */
    private Integer menuId;

    /**
     * 数据权限类型：0-全部，1-管护人，2-团队领导
     */
    private Integer dataType;

    public ManageRolePermission() {
    }

    public ManageRolePermission(Integer roleId,Integer menuId,Integer dataType) {
        this.roleId=roleId;
        this.menuId=menuId;
        this.dataType=dataType;
    }

    public ManageRolePermission(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取菜单ID
     *
     * @return menu_id - 菜单ID
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单ID
     *
     * @param menuId 菜单ID
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取数据权限类型：0-全部，1-管护人，2-团队领导
     *
     * @return data_type - 数据权限类型：0-全部，1-管护人，2-团队领导
     */
    public Integer getDataType() {
        return dataType;
    }

    /**
     * 设置数据权限类型：0-全部，1-管护人，2-团队领导
     *
     * @param dataType 数据权限类型：0-全部，1-管护人，2-团队领导
     */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }


}