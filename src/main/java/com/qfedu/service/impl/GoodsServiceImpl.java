package com.qfedu.service.impl;

import com.qfedu.dao.GoodsMapper;
import com.qfedu.pojo.Goods;
import com.qfedu.service.GoosService;
import com.qfedu.util.ResultUtil;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gengweichao
 * @date 2019/3/1 11:15
 */
@Service
public class GoodsServiceImpl implements GoosService {
    @Autowired
    private GoodsMapper goodsDao;
    @Override
    public ResultVo findGoodsById(int typeId) {
        List<Goods> list = goodsDao.findGoodsById(typeId);
        if(list != null){
            return ResultUtil.exec(true,"查询成功",list);
        }else {
            return ResultUtil.exec(false,"查询失败",null);
        }
    }

    @Override
    public ResultVo countByGoods() {

        int count = goodsDao.count();
        if(count > 0){
            return ResultUtil.exec(true,"查询成功",count);
        }else {
            return ResultUtil.exec(false,"查询失败",null);
        }

    }

    @Override
    public ResultVo findGoodsByIdcount(int id, int star, int limit) {
        List<Goods> list = goodsDao.findGoodsByID(id, star, limit);
        if(list != null){
            return ResultUtil.exec(true,"查询成功",list);
        }else {
            return ResultUtil.exec(false,"查询失败",null);
        }
    }
}
