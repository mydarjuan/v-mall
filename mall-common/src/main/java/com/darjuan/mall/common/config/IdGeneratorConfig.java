package com.darjuan.mall.common.config;

import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.darjuan.mall.common.utils.id.CustomIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 刘建波
 * @date 2019-12-23
 */
@Configuration
public class IdGeneratorConfig {

  @Bean
  public GlobalConfig globalConfig() {
    GlobalConfig conf = new GlobalConfig();
    conf.setIdentifierGenerator(new CustomIdGenerator());
    return conf;
  }
}
