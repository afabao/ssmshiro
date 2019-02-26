package com.afabao.sys.entity;

import javax.persistence.*;

@Table(name = "sys_role_resource")
public class RoleResource {
    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 菜单/按钮ID
     */
    @Column(name = "resource_id")
    private Integer resourceId;

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
     * 获取菜单/按钮ID
     *
     * @return resource_id - 菜单/按钮ID
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * 设置菜单/按钮ID
     *
     * @param resourceId 菜单/按钮ID
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}