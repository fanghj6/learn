package com.junit.junittest.common;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.junit.junittest.config.DBUnitConfig;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AbstractDaoDbunitTest
 * @Description TODO
 * @date 2019/9/16  15:38
 **/
//@RunWith(SpringRunner.class)
//@MybatisTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
//        DirtiesContextTestExecutionListener.class,
//        TransactionalTestExecutionListener.class,
//        DbUnitTestExecutionListener.class })
//@ContextConfiguration(classes = {DBUnitConfig.class})
//public class AbstractDaoDbunitTest {
//}
