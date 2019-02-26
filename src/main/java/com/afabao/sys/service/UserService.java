package com.afabao.sys.service;

import com.afabao.sys.entity.User;

import java.util.List;
import java.util.Set;

public interface UserService {

    User findUserByUser(User user);

    /*获取登陆用户的角色*/
    Set<String> getUserRoleSet(Integer id);

    /*获取登陆用户的角色权限*/
    Set<String> getUserPermissionSet(Integer id);

    /*查找所有用户*/
    List<User> selectAll();
}
