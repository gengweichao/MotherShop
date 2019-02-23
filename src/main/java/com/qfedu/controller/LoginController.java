package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.service.impl.UserServiceImpl;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResultVo login(String name,String password){
        return userService.login(name,password);
    }


}
