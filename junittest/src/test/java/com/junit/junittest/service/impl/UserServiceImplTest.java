package com.junit.junittest.service.impl;

import com.junit.junittest.db.User;
import com.junit.junittest.mapper.UserMapper;
import com.junit.junittest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {UserServiceImpl.class})
@Slf4j
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserMapper userMapper;

    @Test
    public void selectByPrimaryKey() {
       User user = userService.selectByPrimaryKey(1);
    }
}