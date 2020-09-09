package com.sl.shoppingmart.model.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 展示商品信息页
 */
@Data
public class GoodsListVo {

  /**
   * 商品id
   */
  private Integer gId;

  /**
   * 商品图片
   */
  private String gImg;

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
   * 0：没有过期  1：过期
   */
  private Boolean gIsOverDue;


  private static final long serialVersionUID = 1L;
}
