package com.sl.shoppingmart.model.vo;

import lombok.Data;

import java.io.Serializable;
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
   * 0：没有过期  1：过期
   */
  private Boolean gIsOverDue;

  /**
   * 0：没有删除  1：已删除
   */
  private Boolean gIsdel;

  private static final long serialVersionUID = 1L;
}
