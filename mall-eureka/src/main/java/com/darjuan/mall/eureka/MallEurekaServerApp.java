package com.darjuan.mall.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 刘建波
 * @date 2019-12-30
 */

@SpringBootApplication
@EnableEurekaServer
public class MallEurekaServerApp {

  /**
   * 容器启动主方法
   *
   * @param args 入参
   */
  public static void main(String[] args) {
    SpringApplication.run(MallEurekaServerApp.class, args);
  }

}
