package com.sl.shoppingmart.service;

import com.sl.shoppingmart.manager.result.R;

public interface GoodsService {
  /**
   * 获取商品分页信息
   * @return 商品信息列表
   */
  R listGood();

  /**
   * 商品分类
   * @return 某类商品信息列表
   */
  R typeGood(Integer type);

  /**
   * 获取商品详情
   * @param gId 商品id
   * @return 该商品详情
   */
  R goodsDetail(Integer gId);
}
