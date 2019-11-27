package com.disign.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Info
 * @Description TODO
 * @date 2019/9/17  21:31
 **/
@Slf4j
public class Info implements Obtain{


    @Override
    public String getInfo(String userId, String token) {
        log.info("成功获取所有资料 userId = {},token = {}",userId,token);
        return "info success";
    }
}
