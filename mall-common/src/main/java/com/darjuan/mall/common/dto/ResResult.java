package com.darjuan.mall.common.dto;

import lombok.Data;

/**
 * @author 刘建波
 * @date 2019-12-10
 */
@Data
public class ResResult {

  private int code;
  private Object data;
  private String msg;

  private ResResult(int code, String msg, Object data) {
    this.code = code;
    this.msg = msg;
    this.data = data;
  }

  public static ResResult success(Object data) {
    return new ResResult(0, "成功", data);
  }

  public static ResResult fail(Object data) {
    return new ResResult(-1, "失败", data);
  }
}
