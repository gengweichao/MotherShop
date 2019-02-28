package com.qfedu.service;

import com.qfedu.pojo.User;
import com.qfedu.vo.ResultVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author gengweichao
 * @date 2019/2/23 18:54
 */
public interface UserService {
    //用户账号密码登录
    public ResultVo login(String name, String password);

    //增加用户
    public ResultVo addUser(User user);
}
