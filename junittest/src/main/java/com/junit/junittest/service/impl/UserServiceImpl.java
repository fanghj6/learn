package com.junit.junittest.service.impl;

import com.junit.junittest.db.User;
import com.junit.junittest.mapper.UserMapper;
import com.junit.junittest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fhj
 * @version 1.0
 * @ClassName UserServiceImpl
 * @Description TODO
 * @date 2019/9/7  13:18
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
