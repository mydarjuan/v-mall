package com.darjuan.mall.order.api.service;

import com.darjuan.mall.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 刘建波
 * @date 2019-12-31
 */
@Service
public class UserRibbonService {

    @Autowired
    RestTemplate restTemplate;

    public List<User> getList() {
        return restTemplate.getForObject("http://v-mall-user-api/user/list",List.class);
    }
}
