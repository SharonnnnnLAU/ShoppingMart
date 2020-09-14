package com.sl.shoppingmart.dao;

import com.sl.shoppingmart.pojo.OrderGood;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodDao {
    int deleteByPrimaryKey(Integer odId);

    int insert(OrderGood record);

    int insertSelective(OrderGood record);

    OrderGood selectByPrimaryKey(Integer odId);

    int updateByPrimaryKeySelective(OrderGood record);

    int updateByPrimaryKey(OrderGood record);

    Integer addGood(@Param("gid") Integer gid, @Param("gnum") Integer gnum, @Param("oid") Integer oid);
}
