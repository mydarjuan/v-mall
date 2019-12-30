package com.darjuan.mall.user.api.annotation;

import java.lang.annotation.*;

/**
 * <p></p>
 *
 * @author liujianbo
 * @version v1  KthLog.java
 * @since 2019-12-26 17:12
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface KthLog {
  String value() default "";
}
