package com.qlx.service;

import com.qlx.po.User;

import java.util.List;

/**
 * UserService
 * @author timing
 */
public interface UserService {
    /**
     * @return 用户集合
     */
    List<User> showUserList();
}
