package com.afabao.sys.service.impl;

import com.afabao.sys.dao.UserMapper;
import com.afabao.sys.entity.User;
import com.afabao.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserMapper userMapper;


    public User login(User user) {
        return userMapper.selectOne(user);
    }

    public User findUserByUser(User user) {
        return userMapper.findUserByUser(user);
    }

    public Set<String> getUserRoleSet(Integer id) {
        return userMapper.getUserRoleSet(id);
    }

    public Set<String> getUserPermissionSet(Integer id) {
        return userMapper.getUserPermissionSet(id);
    }

    public List<User> selectAll(){
        return userMapper.selectAll();
    }
}
