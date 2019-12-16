package com.darjuan.mall.common.utils.id;

/***
 * ID生成器
 */
public interface IdGenerator {

  Long generateLongId();

  String generateStringId();

  String generateStringIdWithDate();

}
