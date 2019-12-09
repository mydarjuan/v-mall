package com.darjuan.mall.common.filter;

import com.darjuan.mall.common.response.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 刘建波
 * @date 2019-12-09
 */

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

  @ExceptionHandler(Exception.class)
  public String runtimeExceptionHandler(Exception ex) {
    return exceptionFormat(1, ex);
  }

  private <T extends Throwable> String exceptionFormat(Integer code, T ex) {
    ex.printStackTrace();
    return JsonResult.failed(code, ex.getMessage());
  }
}
