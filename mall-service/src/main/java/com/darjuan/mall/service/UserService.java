package com.darjuan.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.darjuan.mall.model.User;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 刘建波
 * @date 2019-12-08
 */
public interface UserService extends IService<User> {

  @Transactional
  public List<User> getUserList();

  @Transactional
  public void addUser(User user);
}
