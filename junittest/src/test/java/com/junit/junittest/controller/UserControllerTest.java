package com.junit.junittest.controller;

import com.junit.junittest.db.User;
import com.junit.junittest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
@ContextConfiguration(classes = {
        UserController.class
})
@Slf4j
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void selectByPrimaryKey() throws Exception {
        User user = new User();
        user.setName("test");
        user.setAge(20);
        user.setCareer("it");
        Mockito.when(userService.selectByPrimaryKey(1)).thenReturn(user);

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/junit/user/selectByPrimaryKey/1");
        MvcResult mvcResult = mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("name").value(user.getName()))
                .andExpect(MockMvcResultMatchers.jsonPath("age").value(user.getAge()))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();

    }
}