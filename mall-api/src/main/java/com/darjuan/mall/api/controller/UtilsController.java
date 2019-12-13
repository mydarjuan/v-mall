package com.darjuan.mall.api.controller;

import com.alibaba.fastjson.JSON;
import com.darjuan.mall.common.utils.RedisUtil;
import com.darjuan.mall.common.dto.ReqDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/utils")
public class UtilsController {

  @Autowired
  private RedisUtil redisUtil;

  @ApiOperation(value = "添加缓存对象", notes = "添加缓存对象")
  @PostMapping("/redis/set")
  public Object redisSet(@RequestBody ReqDto req) {
    redisUtil.set(req.getKey(), JSON.toJSON(req));
    return true;
  }

  @ApiOperation(value = "获取缓存对象", notes = "获取缓存对象")
  @GetMapping("/redis/get/{key}")
  public Object redisGet(@PathVariable(value = "key", required = false) String key) {
    return redisUtil.get(key);
  }
}
