package com.afabao.sys.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_resource")
public class Resource {
    /**
     * 菜单/按钮ID
     */
    @Id
    private Integer id;

    /**
     * 上级菜单ID
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 菜单/按钮名称
     */
    private String name;

    /**
     * 菜单URL
     */
    private String url;

    /**
     * 权限标识
     */
    private String perms;

    /**
     * 图标
     */
    private String icon;

    /**
     * 类型 0菜单 1按钮 2根节点
     */
    private String type;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取菜单/按钮ID
     *
     * @return id - 菜单/按钮ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置菜单/按钮ID
     *
     * @param id 菜单/按钮ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取上级菜单ID
     *
     * @return parent_id - 上级菜单ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置上级菜单ID
     *
     * @param parentId 上级菜单ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取菜单/按钮名称
     *
     * @return name - 菜单/按钮名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单/按钮名称
     *
     * @param name 菜单/按钮名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取菜单URL
     *
     * @return url - 菜单URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置菜单URL
     *
     * @param url 菜单URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取权限标识
     *
     * @return perms - 权限标识
     */
    public String getPerms() {
        return perms;
    }

    /**
     * 设置权限标识
     *
     * @param perms 权限标识
     */
    public void setPerms(String perms) {
        this.perms = perms;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取类型 0菜单 1按钮 2根节点
     *
     * @return type - 类型 0菜单 1按钮 2根节点
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型 0菜单 1按钮 2根节点
     *
     * @param type 类型 0菜单 1按钮 2根节点
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Long getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Long sort) {
        this.sort = sort;
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
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}