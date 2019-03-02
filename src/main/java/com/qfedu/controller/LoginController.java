package com.qfedu.controller;

import com.qfedu.dao.UserMapper;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.service.impl.UserServiceImpl;
import com.qfedu.util.ResultUtil;
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

    @Autowired
    private UserMapper userDao;

    //登录操作
    @GetMapping("login.do")
    public ResultVo login(String name, String password,HttpServletRequest request){

        User user = userDao.selectByName(name);
        request.getSession().setAttribute("user",user);

        return userService.login(name,password);
    }
    //注册
    @RequestMapping("res.do")
    public ResultVo addByUser(User user){

        return  userService.addUser(user);
    }

    //获得session对象

    @RequestMapping("getsession.do")
    public ResultVo getSeesion(HttpSession session){

        User user = (User) session.getAttribute("user");
        if(user != null) {
            return ResultUtil.exec(true,"用户登录保存session",user);
        }else{
            return ResultUtil.exec(false,"用户为登录",null);
        }

    }

    //删除session对象
    @RequestMapping("deletesession.do")
    public ResultVo deleteSession(HttpSession session){
        session.invalidate();
        return ResultUtil.exec(true,"删除session",null);
    }
}
