package com.darjuan.mall.service;

import com.darjuan.mall.dao.mapper.UserMapper;
import com.darjuan.mall.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刘建波
 * @date 2019-12-08
 */
@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public List<User> getUser() {
    return userMapper.selectList(null);
  }
}
