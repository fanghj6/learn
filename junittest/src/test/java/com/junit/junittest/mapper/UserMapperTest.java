package com.junit.junittest.mapper;


import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.junit.junittest.common.AbstractDaoDbunitTest;
import com.junit.junittest.db.User;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;


@MapperScan("com.junit.junittest.mapper")
public class UserMapperTest extends AbstractDaoDbunitTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectByPrimaryKey() {
        Integer id = 1;
        User user = userMapper.selectByPrimaryKey(id);
        Assert.notNull(user,"====ok=====");
    }

}