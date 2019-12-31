package com.darjuan.mall.order.api.controller;

import com.darjuan.mall.model.Order;
import com.darjuan.mall.model.User;
import com.darjuan.mall.order.api.service.UserFeignService;
import com.darjuan.mall.order.api.service.UserRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author 刘建波
 * @date 2019-12-31
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserRibbonService userRibbonService;


    @Autowired
    private UserFeignService userFeignService;

    @GetMapping("/list")
    public List<Order> getList() {
        List<Order> orders = new ArrayList<>();
        Arrays.asList(1, 2, 3, 4, 5).forEach(integer -> {
            Order order = new Order();
            order.setOrderId(integer);
            order.setOrderDate(new Date());
            orders.add(order);
        });
        return orders;
    }


    @GetMapping("/users")
    public List<User> getUsers() {
        return userRibbonService.getList();
    }


    @GetMapping("/users/list")
    public List<User> getRouteUsers() {
        return userFeignService.getList();
    }

}
