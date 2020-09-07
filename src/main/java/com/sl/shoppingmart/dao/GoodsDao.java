package com.sl.shoppingmart.dao;

import com.sl.shoppingmart.pojo.Goods;

public interface GoodsDao {
    int deleteByPrimaryKey(Integer gId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}