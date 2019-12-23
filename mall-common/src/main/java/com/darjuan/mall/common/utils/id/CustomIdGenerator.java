package com.darjuan.mall.common.utils.id;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 刘建波
 * @date 2019-12-23
 */
@Component
public class CustomIdGenerator implements IdentifierGenerator {

  @Autowired
  private IdGenerator idGenerator;

  @Override
  public Long nextId(Object entity) {
    return idGenerator.generateLongId();
  }

}
