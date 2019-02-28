package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.service.impl.UserServiceImpl;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author gengweichao
 * @date 2019/2/23 19:58
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    //登录操作
    @GetMapping("login.do")
    public ResultVo login(String name, String password, HttpSession session, HttpServletRequest resquset){

        resquset.getSession().setAttribute("userName", name);
        return userService.login(name,password);
    }
    @RequestMapping("res.do")
    public ResultVo addByUser(User user){

        return  userService.addUser(user);
    }
}
