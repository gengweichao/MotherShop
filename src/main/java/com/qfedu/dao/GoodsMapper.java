package com.qfedu.dao;

import com.qfedu.pojo.Goods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    //根据typeId查询商品信息
    List<Goods> findGoodsById(int typeId);

    //查询一共有多少条商品信息
    @Select("SELECT count(0) FROM t_goods")
    int count();

    //根据ID分页查询商品信息
    @Select("select * from t_goods where gid=#{id} limit #{star},#{limit}")
    List<Goods> findGoodsByID(@Param("id") int id,@Param("star") int star,@Param("limit") int limit);

}