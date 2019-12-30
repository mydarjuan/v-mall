package com.darjuan.mall.user.api.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import com.xxl.job.core.log.XxlJobFileAppender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author 刘建波
 * @date 2019-12-08
 */
@Configuration
@Conditional(JobStartCondition.class)
public class XxlJobConfig {

  private Logger logger = LoggerFactory.getLogger(XxlJobConfig.class);

  @Value("${xxl.job.admin.addresses}")
  private String adminAddresses;

  @Value("${xxl.job.executor.appname}")
  private String appName;

  @Value("${xxl.job.executor.ip}")
  private String ip;

  @Value("${xxl.job.executor.port}")
  private int port;

  @Value("${xxl.job.accessToken}")
  private String accessToken;

  @Value("${xxl.job.executor.logpath}")
  private String logPath;

  @Value("${xxl.job.executor.logretentiondays}")
  private int logRetentionDays;


  /**
   * 初始化一个xxlJobExecutor
   */
  @Bean
  public XxlJobSpringExecutor xxlJobExecutor() {
    logger.info(">>>>>>>>>>> xxl-job config init.");
    XxlJobSpringExecutor xxlJobExecutor = new XxlJobSpringExecutor();
    xxlJobExecutor.setAdminAddresses(adminAddresses);
    xxlJobExecutor.setAppName(appName);
    xxlJobExecutor.setIp(ip);
    xxlJobExecutor.setPort(port);
    xxlJobExecutor.setAccessToken(accessToken);
    xxlJobExecutor.setLogPath(logPath);
    xxlJobExecutor.setLogRetentionDays(logRetentionDays);
    XxlJobFileAppender.initLogPath(logPath);
    return xxlJobExecutor;
  }
}
