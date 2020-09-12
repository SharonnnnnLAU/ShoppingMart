package com.sl.shoppingmart.manager.result;


public enum Status {

  OK(0, "SUCCESS"), // 成功
  ARGS_NOT_ALLOW_NULL(1, "参数不能为空，请检查参数后再试"),  // 请求的参数存在为空
  REQUEST_DATA_NOT_EXIST(2, "请求数据不存在，请刷新后再试"), // 数据库数据不存在
  DB_OPERATE_FAILED(3, "网络貌似开小差，请刷新后重试"),     // 数据库操作失败
  ARGS_NOT_MATCH_NEED(4, "请求数据不规范，请检查后重试"),   // 请求参数不符合规范
  REDIS_OPERATE_FAILED(5, "网络貌似开小差，请稍后重试"),   // redis出现问题
  LOGIN_CAPTCHA_ERROR(6, "验证码错误,请重试"),   // 登陆验证码错误
  USER_NOT_EXIST(997, "该用户不存在，请添加用户后再操作"),    // 用户不存在
  CARD_NOT_EXIST(996, "会员卡不存在，请新增会员卡后再操作"),    // 会员卡不存在
  COURSE_NOT_EXIST(995, "课程不存在，请检查后再操作"),    // 课程不存在
  CARD_BALANCE_NOT_ENOUGH(994, "会员卡余额不足，请充值后再操作"),    // 会员卡余额不足
  USER_EMAIL_NOT_EXIST(993, "用户邮箱不存在，请绑定后再操作"),    // 用户未绑定邮箱
  VAILDCODE_IS_OUTTIME(992, "验证码已过期，请重试"),    // 验证码过期
  VAILDCODE_NOT_MATCH(991, "验证码错误"),    // 验证码错误
  USER_NOT_EXIST_OR_ID_PASS_ERROR(990, "账号密码错误或该会员不存在，请确认后再操作"),    // 登陆账号密码错误或该会员不存在
  ERROR(999, "未知错误"),                               // 抛出的异常
  PERMISSION_DENIED(1000, "权限不足"),    // 权限不足
  NOT_LOGIN(1001, "没有登陆"),
  LOGIN_FAILED(1002, "账号或密码错误，请重试");    // 账号或密码错误


  public Integer code;
  public String msg;

  Status(Integer code, String msg){
    this.code = code;
    this.msg = msg;
  }

}
