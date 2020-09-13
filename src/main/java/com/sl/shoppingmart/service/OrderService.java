package com.sl.shoppingmart.service;

import com.sl.shoppingmart.manager.result.R;

public interface OrderService {
  /**
   * 添加单个商品的订单
   * @param gid 要添加的商品id
   * @param gnum 要添加的商品数量
   * @param username 购买用户用户名
   * @return
   */
  R addGood(Integer gid, Integer gnum, String username);
}
