package com.junit.junittest.test;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TestSign
 * @Description TODO
 * @date 2019/11/21  12:11
 **/
@Service
@Data
public class TestSign implements Sign{

    private String type = "TestSign";


    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public String companyCode() {
        return "TestSign";
    }
}
