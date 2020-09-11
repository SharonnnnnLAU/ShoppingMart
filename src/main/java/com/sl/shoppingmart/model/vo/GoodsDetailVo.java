package com.sl.shoppingmart.model.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class GoodsDetailVo {
  /**
   * 商品id
   */
  private Integer gId;

  /**
   * 商品描述
   */
  private String gDesc;

  /**
   * 商品价格
   */
  private BigDecimal gPrice;

  /**
   * 商品名称
   */
  private String gName;

  /**
   * 商品类型 0:coat 1:plants 2:shirt 3:shoes 4:skirt
   */
  private Integer gType;

  /**
   * 封面图片
   */
  private String gImg;

}
