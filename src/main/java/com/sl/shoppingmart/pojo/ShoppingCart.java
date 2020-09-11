package com.sl.shoppingmart.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * shopping_cart
 * @author 
 */
@Data
public class ShoppingCart implements Serializable {
    /**
     * 购物车id
     */
    private Integer scId;

    /**
     * 商品id
     */
    private Integer gId;

    /**
     * 0：未删除 1：已删除
     */
    private Boolean scIsdel;

    /**
     * 商品数量
     */
    private Integer gNum;

    private static final long serialVersionUID = 1L;
}