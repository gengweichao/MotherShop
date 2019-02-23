package com.qfedu.dao;

import com.qfedu.pojo.Cat;

public interface CatMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Cat record);

    int insertSelective(Cat record);

    Cat selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Cat record);

    int updateByPrimaryKey(Cat record);
}