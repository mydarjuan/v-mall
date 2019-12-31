package com.darjuan.mall.order.api.service;

import com.darjuan.mall.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("v-mall-user-api")
public interface UserFeignService {

    @RequestMapping("/user/list")
    public List<User> getList();
}
