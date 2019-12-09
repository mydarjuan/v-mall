package com.darjuan.mall.api.controller; /**
 * <p></p>
 *
 * @author liujianbo
 * @version v1  com.darjuan.mall.api.controller.OrderController.java
 * @since 2019-12-08 15:44
 */

import com.darjuan.mall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/order")
public class OrderController {

  private Logger logger = LoggerFactory.getLogger(OrderController.class);

  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  public Object getOrder(@PathVariable(value = "id", required = false) Integer id) {

    logger.info(id.toString());

    return id;
  }

  @GetMapping("/detail")
  public Object getOrder() {
    return 1;
  }


  @GetMapping("/list")
  public Object getUserList() {
    return userService.getUser();
  }
}
