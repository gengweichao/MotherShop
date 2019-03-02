package com.qfedu.controller;

import com.qfedu.service.GoosService;
import com.qfedu.util.ResultUtil;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gengweichao
 * @date 2019/3/1 11:19
 */
@RestController
public class GoodController {
    @Autowired
    private GoosService goosService;

    @RequestMapping("findGoodsById.do")
    public ResultVo findAllGoodsByIds(int typeId){
        return  goosService.findGoodsById(typeId);
    }

    @RequestMapping("findGoodsCount.do")
    public ResultVo findCountByGoods(){
        return goosService.countByGoods();
    }

    @RequestMapping("findGoodsByIdCount.do")
    public  ResultVo findGoodsByIdCount(int id,int star,int limit){
        return  goosService.findGoodsByIdcount(id,star,limit);
    }
}
