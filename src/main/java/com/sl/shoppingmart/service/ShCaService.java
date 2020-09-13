package com.sl.shoppingmart.service;

import com.sl.shoppingmart.manager.result.R;

public interface ShCaService {
  /**
   * 根据购物车id获取商品信息
   * @param scid 购物车id
   * @return 该购物车的商品
   */
  public R listSC(Integer scid);

  /**
   * 加购物车
   * @param gid 要加的商品id
   * @param gnum 要加的数量
   * @param scid 对应购物车id
   * @return
   */
  public R addCar(Integer gid, Integer gnum, Integer scid);
}
