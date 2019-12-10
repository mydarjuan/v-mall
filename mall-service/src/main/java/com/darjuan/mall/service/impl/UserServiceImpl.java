package com.darjuan.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.darjuan.mall.dao.mapper.UserMapper;
import com.darjuan.mall.model.User;
import com.darjuan.mall.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 刘建波
 * @date 2019-12-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
