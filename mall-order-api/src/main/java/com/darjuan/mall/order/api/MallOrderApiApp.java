package com.darjuan.mall.order.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

/**
 * @author 刘建波
 * @date 2019-12-08
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.darjuan.mall"})
@MapperScan(basePackages = {"com.darjuan.mall.dao.mapper"})
@EnableTransactionManagement
@EnableEurekaClient
@EnableFeignClients
public class MallOrderApiApp {

    /**
     * 容器启动主方法
     *
     * @param args 入参
     */
    public static void main(String[] args) {
        SpringApplication.run(MallOrderApiApp.class, args);
    }


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
