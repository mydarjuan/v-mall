package com.darjuan.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.darjuan.mall.dao.mapper.UserMapper;
import com.darjuan.mall.model.User;
import com.darjuan.mall.service.UserService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author 刘建波
 * @date 2019-12-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

  @Override
  public List<User> getUserList() {
    List<User> userList = baseMapper.selectList(
        new QueryWrapper<User>()
            .lambda()
            .ge(User::getAge, 18)
    );

    return userList;
  }

  @Override
  public void addUser(User user) {
    baseMapper.insert(user);
  }


}
