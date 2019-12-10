package com.darjuan.mall.api.controller;

import com.darjuan.mall.common.dto.ResResult;
import com.darjuan.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘建波
 * @date 2019-12-08
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  public Object getUser(@PathVariable(value = "id", required = false) Integer id) {
    return userService.getById(id);
  }

  @GetMapping("/detail/{id}")
  public Object getDetail(@PathVariable(value = "id", required = false) Integer id) {
    return userService.getById(id);
  }

  @GetMapping("/list")
  public Object getUserList() {
    return ResResult.success(userService.list());
  }

}
