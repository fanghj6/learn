//package com.junit.junittest.mapper;
//
//
//import com.alibaba.fastjson.JSON;
//import com.github.springtestdbunit.annotation.DatabaseOperation;
//import com.github.springtestdbunit.annotation.DatabaseSetup;
//import com.junit.junittest.common.AbstractDaoDbunitTest;
//import com.junit.junittest.db.User;
//import org.junit.Test;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.Assert;
//
//
//@MapperScan("com.junit.junittest.mapper")
//public class UserMapperTest extends AbstractDaoDbunitTest {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    @DatabaseSetup(value = "/data/user-setup.xml",type = DatabaseOperation.INSERT)
//    public void selectByPrimaryKey() {
//        Integer id = 3;
//        User user = userMapper.selectByPrimaryKey(id);
//        System.out.println(JSON.toJSON(user));
//        Assert.notNull(user,"====ok=====");
//    }
//
//}