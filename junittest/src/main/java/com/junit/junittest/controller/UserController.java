package com.junit.junittest.controller;

import com.alibaba.fastjson.JSON;
import com.junit.junittest.db.User;
import com.junit.junittest.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author fhj
 * @version 1.0
 * @ClassName UserController
 * @Description TODO
 * @date 2019/9/7  13:18
 **/
@RestController
@RequestMapping("/junit/user/")
@Slf4j
@Api(value = "UserController",description = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/selectByPrimaryKey/{id}")
    @ApiOperation(value = "selectByPrimaryKey", notes = "根据编号获取用户信息")
    public User selectByPrimaryKey(@PathVariable("id") Integer id) {
        User user = userService.selectByPrimaryKey(id);
        log.info("user is {}", JSON.toJSON(user));
        return user;
    }
}
