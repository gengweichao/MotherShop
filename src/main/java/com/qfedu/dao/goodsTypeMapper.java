package com.qfedu.dao;

import com.qfedu.pojo.goodsType;

public interface goodsTypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(goodsType record);

    int insertSelective(goodsType record);

    goodsType selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(goodsType record);

    int updateByPrimaryKey(goodsType record);
}