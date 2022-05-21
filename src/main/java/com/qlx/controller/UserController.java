package com.qlx.controller;

import com.qlx.po.User;
import com.qlx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * UserController
 * @author timing
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("userList")
    @ResponseBody
    public List<User> showUserList(){
        List<User> users = userService.showUserList();
        return users;
    }
}
