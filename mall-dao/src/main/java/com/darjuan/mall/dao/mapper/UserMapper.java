package com.darjuan.mall.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.darjuan.mall.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 刘建波
 * @date 2019-12-08
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
