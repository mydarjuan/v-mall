package com.darjuan.mall.user.api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author 刘建波
 * @date 2019-12-08
 */
public class JobStartCondition implements Condition {

  private static final Logger LOGGER = LoggerFactory.getLogger(JobStartCondition.class);

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    String config = context.getEnvironment().getProperty("jobEnabled");
    boolean enable = Boolean.valueOf(config);
    LOGGER.info("是否启动job:{}", enable);
    return enable;
  }
}
