package com.darjuan.mall.user.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 刘建波
 * @date 2019-12-08
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.darjuan.mall"})
@MapperScan(basePackages = {"com.darjuan.mall.dao.mapper"})
@EnableTransactionManagement
@EnableEurekaClient
public class MallUserApiApp {

  /**
   * 容器启动主方法
   *
   * @param args 入参
   */
  public static void main(String[] args) {
    SpringApplication.run(MallUserApiApp.class, args);
  }
}
