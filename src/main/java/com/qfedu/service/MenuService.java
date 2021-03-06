package com.qfedu.service;

import com.qfedu.vo.ResultVo;

/**
 * @author gengweichao
 * @date 2019/2/28 19:42
 */
public interface MenuService {

    //获取一级菜单
    public ResultVo selectOne();

    //同时获取一级菜单和子菜单
    public ResultVo selectTwo();

    //查询二级分类
    public  ResultVo selectTwo2();
}
