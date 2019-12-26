package com.darjuan.mall.api.controller; /**
 * <p></p>
 *
 * @author liujianbo
 * @version v1  com.darjuan.mall.api.controller.TestController.java
 * @since 2019-12-25 23:43
 */

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘建波
 * @date 2019-12-25
 */
@RestController
@RequestMapping("/test")
public class TestController {

  @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
  @GetMapping("/list")
  public Object getList() {
    return 1 / 0;
  }

  @ExceptionHandler({RuntimeException.class})
  @ResponseBody
  public Object fix(Exception ex) {
    System.out.println("do This");

    return ex;
  }
}
