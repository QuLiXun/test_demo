package com.qlx.service.impl;

import com.qlx.mapper.TestMapper;
import com.qlx.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author timing
 * @date 2022/10/12
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public List test() {
        return testMapper.test();
    }
}
