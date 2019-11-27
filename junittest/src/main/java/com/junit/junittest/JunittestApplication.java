package com.junit.junittest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.junit.junittest.mapper"})
public class JunittestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunittestApplication.class, args);
    }

}
