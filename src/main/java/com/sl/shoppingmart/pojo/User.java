package com.sl.shoppingmart.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer uId;

    /**
     * 用户密码
     */
    private String uPwd;

    /**
     * 购物车id
     */
    private Integer scId;

    /**
     * 0：用户 1：管理员
     */
    private Boolean uType;

    /**
     * 用户地址
     */
    private String uAddress;

    private static final long serialVersionUID = 1L;
}