package com.darjuan.mall.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author 刘建波
 * @date 2019-12-08
 */
@Configuration
public class DruidConfig extends DruidDataSource {

  @Value("${spring.datasource.url}")
  private String url;

  @Value("${spring.datasource.username}")
  private String username;

  @Value("${spring.datasource.password}")
  private String password;

  @Value("${spring.datasource.initialSize}")
  private int initialSize;

  @Value("${spring.datasource.minIdle}")
  private int minIdle;

  @Value("${spring.datasource.maxActive}")
  private int maxActive;

  @Value("${spring.datasource.maxWait}")
  private int maxWait;

  @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
  private long timeBetweenEvictionRunsMillis;

  @Value("${spring.datasource.minEvictableIdleTimeMillis}")
  private long minEvictableIdleTimeMillis;

  @Value("${spring.datasource.validationQuery}")
  private String validationQuery;

  @Value("${spring.datasource.testWhileIdle}")
  private boolean testWhileIdle;

  @Value("${spring.datasource.testOnBorrow}")
  private boolean testOnBorrow;

  @Value("${spring.datasource.testOnReturn}")
  private boolean testOnReturn;

  @Value("${spring.datasource.removeAbandoned}")
  private boolean removeAbandoned;

  @Value("${spring.datasource.removeAbandonedTimeout}")
  private int removeAbandonedTimeout;

  @Value("${spring.datasource.logAbandoned}")
  private boolean logAbandoned;

  @Value("${spring.datasource.maxOpenPreparedStatements}")
  private int maxOpenPreparedStatements;

  @Bean
  @Primary
  public DataSource dataSource() {
    DruidDataSource druidDataSource = new DruidDataSource();

    druidDataSource.setUrl(url);
    druidDataSource.setUsername(username);
    druidDataSource.setPassword(password);
    druidDataSource.setMinIdle(minIdle);
    druidDataSource.setInitialSize(initialSize);
    druidDataSource.setMaxActive(maxActive);
    druidDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
    druidDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
    druidDataSource.setValidationQuery(validationQuery);
    druidDataSource.setTestWhileIdle(testWhileIdle);
    druidDataSource.setTestOnBorrow(testOnBorrow);
    druidDataSource.setTestOnReturn(testOnReturn);
    druidDataSource.setRemoveAbandoned(removeAbandoned);
    druidDataSource.setRemoveAbandonedTimeout(removeAbandonedTimeout);
    druidDataSource.setLogAbandoned(logAbandoned);
    druidDataSource.setMaxOpenPreparedStatements(maxOpenPreparedStatements);

    return druidDataSource;
  }


}
