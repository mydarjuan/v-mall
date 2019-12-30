package com.darjuan.mall.user.api.controller;

import com.alibaba.fastjson.JSON;
import com.darjuan.mall.common.dto.ResResult;
import com.darjuan.mall.common.utils.id.IdGenerator;
import com.darjuan.mall.common.utils.redis.RedisUtil;
import com.darjuan.mall.model.User;
import com.darjuan.mall.service.UserService;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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


  @Autowired
  private RedisUtil redisUtil;


  @Autowired
  private IdGenerator idGenerator;

  @ApiOperation(value = "获取用户详情", notes = "获取用户详情")
  @GetMapping("/{id}")
  public Object getUser(@PathVariable(value = "id", required = false) Integer id) {
    return userService.getById(id);
  }

  @ApiOperation(value = "获取用户详情", notes = "获取用户详情")
  @GetMapping("/detail/{id}")
  public Object getDetail(@PathVariable(value = "id", required = false) Integer id) {

    return userService.getById(id);
  }

  @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
  @GetMapping("/list")
  public Object getUserList() {

    User user = new User();
    user.setAge(1);
    user.setEmail("test@qq.com");
    user.setName("test");
    user.setId(idGenerator.generateStringId());
    userService.addUser(user);

    return ResResult.success(userService.getUserList());
  }

  @ApiOperation(value = "添加用户", notes = "添加用户")
  @PostMapping("/add")
  public Object addUser(@Valid @RequestBody User user) {

    userService.addUser(user);

    redisUtil.set(idGenerator.generateStringId(), JSON.toJSON(user));

    return true;
  }


}
