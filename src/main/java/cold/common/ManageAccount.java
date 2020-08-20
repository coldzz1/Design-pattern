package cold.common;


import java.util.Date;

public class ManageAccount  {

    public ManageAccount(Integer id){
        this.id=id;
    }
    /**
     * 用户Id
     */

    private Integer id;

    /**
     * 招银用户ID
     */
    private String zyId;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 招银上级ID
     */
    private String fatherZyId;

    /**
     * 用户别名
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 部门ID
     */
    private Integer deptId;

    /**
     * 岗位
     */
    private String job;

    /**
     * 盐
     */
    private String salt;

    /**
     * 用户类型
     */
    private Integer type;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 是否有效(1-有效，2-无效，0-待配置)
     */
    private Integer isValid;

    /**
     * 操作者
     */
    private Integer optId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 0-未删除 1-删除
     */
    private Boolean isDelete;


    /**
     * oa  账号  定时任务 获取的  father_id
     */
    private String oriFatherZyId;
    /**
     * oa  账号  定时任务 获取的  dept_id
     */
    private String oriDeptId;
    /**
     * oa  账号  定时任务 获取的  job
     */
    private String oriJob;
    /**
     * oa  账号  定时任务 获取的  job_id
     */
    private String oriJobId;
    /**
     * oa  账号  定时任务 获取的 0：试用1：正式2：临时3：试用延期4：解聘5：离职6：退休7：无效
     */
    private String sts;

    /**
     * 获取用户Id
     *
     * @return id - 用户Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户Id
     *
     * @param id 用户Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取招银用户ID
     *
     * @return zy_id - 招银用户ID
     */
    public String getZyId() {
        return zyId;
    }

    /**
     * 设置招银用户ID
     *
     * @param zyId 招银用户ID
     */
    public void setZyId(String zyId) {
        this.zyId = zyId;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取招银上级ID
     *
     * @return father_zy_id - 招银上级ID
     */
    public String getFatherZyId() {
        return fatherZyId;
    }

    /**
     * 设置招银上级ID
     *
     * @param fatherZyId 招银上级ID
     */
    public void setFatherZyId(String fatherZyId) {
        this.fatherZyId = fatherZyId;
    }

    /**
     * 获取用户别名
     *
     * @return nickname - 用户别名
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户别名
     *
     * @param nickname 用户别名
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
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
     * 获取部门ID
     *
     * @return dept_id - 部门ID
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置部门ID
     *
     * @param deptId 部门ID
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取岗位
     *
     * @return job - 岗位
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置岗位
     *
     * @param job 岗位
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 获取盐
     *
     * @return salt - 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐
     *
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取用户类型
     *
     * @return type - 用户类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户类型
     *
     * @param type 用户类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取电子邮箱
     *
     * @return email - 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取是否有效(1-有效，2-无效，0-待配置)
     *
     * @return is_valid - 是否有效(1-有效，2-无效，0-待配置)  具体查看 {@link UserStatusEnum}
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效(1-有效，2-无效，0-待配置)
     *
     * @param isValid 是否有效(1-有效，2-无效，0-待配置)   具体查看 {@link UserStatusEnum}
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * 获取操作者
     *
     * @return opt_id - 操作者
     */
    public Integer getOptId() {
        return optId;
    }

    /**
     * 设置操作者
     *
     * @param optId 操作者
     */
    public void setOptId(Integer optId) {
        this.optId = optId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取0-未删除 1-删除
     *
     * @return is_delete - 0-未删除 1-删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置0-未删除 1-删除
     *
     * @param isDelete 0-未删除 1-删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public boolean isNormalUser() {
        return this.getIsDelete() != null && !this.getIsDelete() && this.getIsValid() != null && this.getIsValid() == 1;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getOriFatherZyId() {
        return oriFatherZyId;
    }

    public void setOriFatherZyId(String oriFatherZyId) {
        this.oriFatherZyId = oriFatherZyId;
    }

    public String getOriDeptId() {
        return oriDeptId;
    }

    public void setOriDeptId(String oriDeptId) {
        this.oriDeptId = oriDeptId;
    }

    public String getOriJob() {
        return oriJob;
    }

    public void setOriJob(String oriJob) {
        this.oriJob = oriJob;
    }

    public String getOriJobId() {
        return oriJobId;
    }

    public void setOriJobId(String oriJobId) {
        this.oriJobId = oriJobId;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }
}