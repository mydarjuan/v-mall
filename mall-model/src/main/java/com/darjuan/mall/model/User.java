package com.darjuan.mall.model;

import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author 刘建波
 * @date 2019-12-08
 */
@Data
public class User {

  private Long id;

  @NotBlank(message = "姓名不能为空")
  private String name;

  @NotBlank(message = "年龄不能为空")
  private Integer age;

  @NotBlank(message = "邮件不能为空")
  private String email;
}
