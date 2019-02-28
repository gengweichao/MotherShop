package com.qfedu.dao;

import com.qfedu.pojo.goodsType;

import java.util.List;

public interface goodsTypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(goodsType record);

    int insertSelective(goodsType record);

    goodsType selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(goodsType record);

    int updateByPrimaryKey(goodsType record);

    //查询一级菜单
    List<goodsType> selectOnelevel();

    //查询一级菜单的子菜单项

}