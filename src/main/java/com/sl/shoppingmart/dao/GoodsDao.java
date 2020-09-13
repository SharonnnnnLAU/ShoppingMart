package com.sl.shoppingmart.dao;

import com.sl.shoppingmart.model.vo.GoodsDetailVo;
import com.sl.shoppingmart.model.vo.GoodsListVo;
import com.sl.shoppingmart.pojo.Goods;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

public interface GoodsDao {
  int deleteByPrimaryKey(Integer gId);

  int insert(Goods record);

  int insertSelective(Goods record);

  Goods selectByPrimaryKey(Integer gId);

  int updateByPrimaryKeySelective(Goods record);

  int updateByPrimaryKey(Goods record);

  List<GoodsListVo> listGood();

  List<GoodsListVo> typeGood(Integer type);

  GoodsDetailVo goodsDetail(Integer gId);

  /**
   * order_good
   * @author
   */
  @Data
  class OrderGood implements Serializable {
      /**
       * 主键
       */
      private Integer odId;

      /**
       * 订单id
       */
      private Integer oId;

      /**
       * 订单的商品id
       */
      private Integer gId;

      /**
       * 订单中商品的数量
       */
      private Integer ogNum;

      private static final long serialVersionUID = 1L;
  }
}
