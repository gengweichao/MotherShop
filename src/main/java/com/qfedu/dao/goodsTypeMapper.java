package com.qfedu.dao;

import com.qfedu.pojo.goodsType;
import com.qfedu.vo.MenuVo;

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

    //同时查询一级菜单的子菜单项
    List<MenuVo> selectLevel();

    //查询二级菜单分类

    List<goodsType> selectTwolevel();

}