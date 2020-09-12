package com.sl.shoppingmart.model.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class UserLoginVo {
  /**
   * 用户id
   */
  private Integer uId;

  /**
   * 用户姓名
   */
  @NotEmpty(message = "用户名不能为空")
  private String uName;

  /**
   * 用户密码
   */
  @Size(min = 3,max = 10, message = "密码长度为3-10位")
  private String uPwd;

  /**
   * 0：用户 1：管理员
   */
  private Boolean uType;

  /**
   * 购物车id
   */
  private Integer scId;

  private static final long serialVersionUID = 1L;
}
