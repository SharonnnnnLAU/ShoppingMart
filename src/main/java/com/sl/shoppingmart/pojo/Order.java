package com.sl.shoppingmart.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * order
 * @author 
 */
@Data
public class Order implements Serializable {
    /**
     * 订单id
     */
    private Integer oId;

    /**
     * 下单用户id
     */
    private Integer uId;

    /**
     * 下单商品id
     */
    private Integer gId;

    /**
     * 订单创建时间
     */
    private Date oCreatetime;

    /**
     * 0：处理中 1：发货中  2：缺货中  3：完成   4：已支付   5：已取消  6：已付款
     */
    private Boolean oStatus;

    /**
     * 0:未删除   1：已删除
     */
    private Boolean oIsdel;

    /**
     * 每件商品数量
     */
    private Integer oGNum;

    private static final long serialVersionUID = 1L;
}