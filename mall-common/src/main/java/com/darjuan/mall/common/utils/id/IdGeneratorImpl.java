package com.darjuan.mall.common.utils.id;

import java.util.Date;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IdGeneratorImpl implements IdGenerator {

  @Autowired
  private SnowflakeIdWorker snowflakeIdWorker;

  @Override
  public Long generateLongId() {
    return snowflakeIdWorker.nextId();
  }

  @Override
  public String generateStringId() {
    return String.valueOf(snowflakeIdWorker.nextId());
  }

  @Override
  public String generateStringIdWithDate() {
    return DateFormatUtils.format(new Date(), "yyyyMMdd") + generateStringId();
  }
}
