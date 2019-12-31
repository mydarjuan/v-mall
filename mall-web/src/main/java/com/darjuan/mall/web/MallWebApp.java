package com.darjuan.mall.web;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 刘建波
 * @date 2019-12-08
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.darjuan.mall"})
@MapperScan(basePackages = {"com.darjuan.mall.dao.mapper"})
@EnableAdminServer
@EnableEurekaClient
public class MallWebApp {

  /**
   * 容器启动主方法
   *
   * @param args 入参
   */
  public static void main(String[] args) {
    SpringApplication.run(MallWebApp.class, args);
  }
}