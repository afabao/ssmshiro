package com.afabao.common.realm;

import com.afabao.sys.dao.UserMapper;
import com.afabao.sys.entity.User;
import com.afabao.sys.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;


    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("------进入认证");
        User user = new User();
        String username = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());
        user.setUsername(username);
        user.setPassword(password);
        User user1 = userService.findUserByUser(user);
        System.out.println(user1);
        if(user1 == null){
            throw new UnknownAccountException("用户名或密码错误");
        }

        return new SimpleAuthenticationInfo(user1,password,getName());
    }


    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("------进入授权");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        info.setRoles(userService.getUserRoleSet(user.getId()));
        info.setStringPermissions(userService.getUserPermissionSet(user.getId()));
        return info;
    }


}
