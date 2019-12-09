package com.darjuan.mall.jobs;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

/**
 * @author 刘建波
 * @date 2019-12-09
 */
@JobHandler(value = "demoJobHandler")
@Component
public class DemoJobHandler extends IJobHandler {

  @Override
  public ReturnT<String> execute(String param) throws Exception {
    return SUCCESS;
  }
}