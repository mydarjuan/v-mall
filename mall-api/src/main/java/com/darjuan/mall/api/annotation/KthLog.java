package com.darjuan.mall.api.annotation;

import java.lang.annotation.*;

/**
 * <p></p>
 *
 * @author liujianbo
 * @version v1  com.darjuan.mall.api.annotation.KthLog.java
 * @since 2019-12-26 17:12
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface KthLog {
  String value() default "";
}
