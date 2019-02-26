package com.afabao.sys.controller;

import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(UnknownAccountException.class)
    @ResponseBody
    public Map<String ,Object> unknownAccountException(UnknownAccountException e){
        Map<String ,Object> map = new HashMap<String, Object>();
        map.put("code" ,500);
        map.put("msg" ,e.getMessage());
        return map;
    }

    @ExceptionHandler(UnauthorizedException.class)
    public String unauthorizedException(UnauthorizedException e){
        return "error";
    }
}
