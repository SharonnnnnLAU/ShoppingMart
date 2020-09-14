package com.sl.shoppingmart.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * order_good
 * @author 
 */
@Data
public class OrderGood implements Serializable {
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