package com.qfedu.service;

import com.qfedu.pojo.Goods;
import com.qfedu.vo.ResultVo;

import java.util.List;

/**
 * @author gengweichao
 * @date 2019/3/1 11:14
 */
public interface GoosService {
    //根据ID获取商品信息
    public ResultVo findGoodsById(int typeId);

    //获取所有商品的数量
    public ResultVo countByGoods();

    //根据ID进行分页查询
    public ResultVo findGoodsByIdcount(int id,int star,int limit);
}
