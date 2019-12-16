package com.darjuan.mall.common.utils.lock;

import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * 分布式锁
 *
 * @author liujianbo
 * @date 2016/10/31
 */

@Service
public class RedisLockImpl implements DistributeLockService {

  private static final Logger LOG = LoggerFactory.getLogger(DistributeLockService.class);

  @Autowired
  private StringRedisTemplate stringRedisTemplate;

  @Override
  public boolean lock(String key, String value, long secondTimeout) {
    return stringRedisTemplate.opsForValue().setIfAbsent(key, value, secondTimeout, TimeUnit.SECONDS);
  }

  @Override
  public void unlock(String key, String value) {
    String val = stringRedisTemplate.opsForValue().get(key);
    Boolean del = null;
    if (value.equals(val)) {
      del = stringRedisTemplate.delete(key);
    }
    if (del != null && del.booleanValue()) {
      LOG.info(String.format("Unlock key:%s, value:%s success", key, value));
    } else {
      LOG.info(String.format("Unlock key:%s, value:%s fail", key, value));
    }
  }
}
