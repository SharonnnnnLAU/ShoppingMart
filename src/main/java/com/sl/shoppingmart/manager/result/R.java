package com.sl.shoppingmart.manager.result;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class R<T> implements Serializable {

  private Integer code;

  private String msg;

  private Integer count;

  private T data;

  public R(Status status){
    this.code = status.code;
    this.msg = status.msg;
    this.count = null;
    this.data = null;
  }

  public R(Integer code, String msg){
    this.code = code;
    this.msg = msg;
    this.count = null;
    this.data = null;
  }

  public R(Status status, T data){
    this.code = status.code;
    this.msg = status.msg;
    this.count = null;
    this.data = data;
  }

  public R(Status status,Integer count, T data){
    this.code = status.code;
    this.msg = status.msg;
    this.count = count;
    this.data = data;
  }

  public static R Success() {
    return new R(Status.OK);
  }

  public static R Success(Object data) {
    return new R<>(Status.OK, data);
  }

  public static R Success(Integer count, Object data) {
    return new R<>(Status.OK, count, data);
  }

  public static R Warn(Status status) {
    return new R(status);
  }

  public static R Warn(Integer code, String msg) {
    return new R(code, msg);
  }

  public static R Error() {
    return new R(Status.ERROR);
  }

  public static R Error(Status status) {
    return new R(status);
  }

  public static R Error(Integer code, String msg) {
    return new R(code, msg);
  }
}
