package com.qlx.controller;

import com.qlx.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author timing
 * @date 2022/10/12
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;


    @RequestMapping("/test")
    public List test(){

        return testService.test();
    }
}
