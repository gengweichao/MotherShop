package com.qfedu.controller;

import com.qfedu.service.MenuService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gengweichao
 * @date 2019/2/28 18:08
 */
@RestController
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("selectOne.do")
    public ResultVo selectOneLevle1(){
        return menuService.selectOne();
    }
}
