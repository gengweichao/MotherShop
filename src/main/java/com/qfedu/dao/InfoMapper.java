package com.qfedu.dao;

import com.qfedu.pojo.Info;

public interface InfoMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Info record);

    int insertSelective(Info record);

    Info selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}