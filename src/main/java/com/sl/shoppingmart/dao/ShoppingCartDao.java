package com.sl.shoppingmart.dao;

import com.sl.shoppingmart.pojo.ShoppingCart;

public interface ShoppingCartDao {
    int deleteByPrimaryKey(Integer scId);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer scId);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
}