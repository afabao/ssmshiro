package com.afabao.sys.dao;

import com.afabao.sys.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.Set;

public interface UserMapper extends Mapper<User> {

    User findUserByUser(User user);

    /*获取登陆用户的角色*/
    Set<String> getUserRoleSet(Integer id);

    /*获取登陆用户的角色权限*/
    Set<String> getUserPermissionSet(Integer id);

}