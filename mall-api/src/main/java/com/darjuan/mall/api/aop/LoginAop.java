package com.darjuan.mall.api.aop;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 刘建波
 * @date 2019-12-26
 */

@Aspect
@Component
public class LoginAop {

  @Pointcut("execution(public * com.darjuan.mall.api.controller.*.*(..))")
  private void loginAop() {
  }

  @Before("loginAop()")
  public void doBefore(JoinPoint joinPoint) throws Exception {
    //throw new Exception(JSONObject.toJSONString(joinPoint.getArgs()));
  }

  @AfterReturning(value = "loginAop()", returning = "params")
  public JSONObject doAfterReturning(JoinPoint joinPoint, JSONObject params) {
    return null;
  }

}
