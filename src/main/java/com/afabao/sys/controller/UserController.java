package com.afabao.sys.controller;

import com.afabao.sys.entity.User;
import com.afabao.sys.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 主页
     * @return
     */
    @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    /**
     * 用户列表
     * @param model
     * @return
     */
    @RequestMapping(value = "/user/list" ,method = RequestMethod.GET)
    @RequiresPermissions("sys:use")
    public String userList(Model model){
        List<User> list = userService.selectAll();
        model.addAttribute("list",list);
        return "/user/user_list";
    }

    /**
     * 登出
     * @return
     */
    @RequestMapping(value = "/logout" ,method = RequestMethod.GET)
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login";

    }

    @RequestMapping(value = "/error" ,method = RequestMethod.GET)
    public String error(){
        return "error";
    }

}
