package com.qlx.mapper;

import com.qlx.pojo.User;

import java.util.List;

/**
 * UserMapper
 * @author timing
 */
public interface UserMapper {

    /**
     * @return 用户集合
     */
    List<User> showUserList();

}
