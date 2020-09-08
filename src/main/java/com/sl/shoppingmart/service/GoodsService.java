package com.sl.shoppingmart.service;

import com.sl.shoppingmart.manager.result.R;

public interface GoodsService {
  /**
   * 获取商品分页信息
   * @param page 需求页
   * @param limit 每页条数
   * @return 商品信息列表
   */
  R listGood(Integer page, Integer limit);
}
