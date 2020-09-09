package com.sl.shoppingmart.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * goods
 * @author
 */
@Data
public class Goods implements Serializable {
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
     * 0：没有过期  1：过期
     */
    private Boolean gIsOverDue;

    /**
     * 0：没有删除  1：已删除
     */
    private Boolean gIsdel;

    /**
     * 商品类型 0:coat 1:plants 2:shirt 3:shoes 4:skirt
     */
    private Integer gType;

    /**
     * 封面图片
     */
    private String gImg;

    private static final long serialVersionUID = 1L;
}
