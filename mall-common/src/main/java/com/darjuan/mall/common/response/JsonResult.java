package com.darjuan.mall.common.response;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

/**
 * @author 刘建波
 * @date 2019-12-09
 */
@Data
public class JsonResult implements Serializable {

  private int code;
  private String msg;
  private Map<String, Object> data;

  public JsonResult() {
  }

  ;

  public JsonResult(int code, String msg, Map<String, Object> data) {
    this.code = code;
    this.msg = msg;
    this.data = data;
  }

  public static String success() {
    return success(new HashMap(0));
  }

  public static String success(Map<String, Object> data) {
    return JSON.toJSONString(new JsonResult(0, "解析成功", data));
  }

  public static String failed() {
    return failed("解析失败");
  }

  public static String failed(String msg) {
    return failed(-1, msg);
  }

  public static String failed(int code, String msg) {
    return JSON.toJSONString(new JsonResult(code, msg, new HashMap(0)));
  }

}