package com.qfedu.service.impl;

import com.qfedu.dao.goodsTypeMapper;
import com.qfedu.pojo.goodsType;
import com.qfedu.service.MenuService;
import com.qfedu.util.ResultUtil;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gengweichao
 * @date 2019/2/28 19:42
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private goodsTypeMapper goodsTypeDao;

    @Override
    public ResultVo selectOne() {
       List<goodsType> goodsTypes =  goodsTypeDao.selectOnelevel();
       if(goodsTypes != null) {
           return ResultUtil.exec(true,"查询成功",goodsTypes);
       } else {
           return ResultUtil.exec(false,"查询失败",null);
       }

    }
}
