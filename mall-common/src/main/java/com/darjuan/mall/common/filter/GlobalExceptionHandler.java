package com.darjuan.mall.common.filter;

import com.darjuan.mall.common.dto.ResResult;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author 刘建波
 * @date 2019-12-09
 */

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseBody
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ResResult handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {

    BindingResult bindingResult = exception.getBindingResult();
    return ResResult.fail(bindingResult.getFieldErrors());
  }


  @ExceptionHandler(Exception.class)
  @ResponseBody
  @ResponseStatus(HttpStatus.UNAUTHORIZED)
  public ResResult handleMethodArgumentNotValidException(Exception exception) {
    return ResResult.fail(exception);
  }
}
