package com.afabao.sys.controller;

import com.afabao.common.utils.Md5Util;
import com.afabao.sys.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String login(){

        return "login";
    }


    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(String username , String password){
        Map<String ,Object> map = new HashMap<String, Object>();
        User user = new User();
        user.setUsername(username);
        user.setPassword(Md5Util.md5(password,"juechuang"));

        UsernamePasswordToken token = new UsernamePasswordToken(username,user.getPassword());
        Subject subject = SecurityUtils.getSubject();

        subject.login(token);
        if(subject.isAuthenticated()){
            map.put("code",200);
        }
        return map;
        //System.out.println(subject.isPermitted("sys:user"));

    }
}
