package com.sl.shoppingmart.dao;

import com.sl.shoppingmart.pojo.Order;

public interface OrderDao {
    int deleteByPrimaryKey(Integer oId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer oId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}