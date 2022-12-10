package com.qlx.service.impl;

import com.qlx.mapper.UserMapper;
import com.qlx.pojo.User;
import com.qlx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * UserService的实现类
 * @author timing
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> showUserList() {
        return userMapper.showUserList();
    }
}
