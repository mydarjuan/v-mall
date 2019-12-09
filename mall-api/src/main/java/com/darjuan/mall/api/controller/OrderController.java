package com.darjuan.mall.api.controller; /**
 * <p></p>
 *
 * @author liujianbo
 * @version v1  com.darjuan.mall.api.controller.OrderController.java
 * @since 2019-12-08 15:44
 */

import com.alibaba.fastjson.JSON;
import com.darjuan.mall.common.utils.RedisUtil;
import com.darjuan.mall.service.UserService;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘建波
 * @date 2019-12-08
 */
@RestController
@RequestMapping("/order")
public class OrderController {

  private Logger logger = LoggerFactory.getLogger(OrderController.class);

  @Autowired
  private UserService userService;

  @Autowired
  private RedisUtil redisUtil;

  @GetMapping("/{id}")
  public Object getOrder(@PathVariable(value = "id", required = false) Integer id) {
    logger.info(id.toString());
    return id;
  }

  @GetMapping("/detail")
  public Object getOrder() {
    int a = 1 / 0;
    return 1;
  }

  @GetMapping("/user/list")
  public Object getUserList() {
    return userService.getUser();
  }

  @PostMapping("/add")
  public Object addOrder() {
    Map<String, String> mp = new HashMap<>();
    mp.put("1", "dajuan");
    redisUtil.set("test-key2", JSON.toJSON(mp));

    redisUtil.set("test-key3", "test-key3");

    return true;
  }

  @GetMapping("/list/{key}")
  public Object getOrders(@PathVariable(value = "key", required = false) String key) {
    return redisUtil.get(key);
  }
}
