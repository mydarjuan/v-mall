package com.darjuan.mall.user.api.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘建波
 * @date 2019-12-10
 */

@RestController
@RequestMapping("/exception")
public class ExceptionController {

  @GetMapping("/list")
  @ExceptionHandler(Exception.class)
  public Object getList() {

    return 1 / 0;

  }
}
