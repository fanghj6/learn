package com.disign.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Verification
 * @Description TODO
 * @date 2019/9/17  21:24
 **/
@Slf4j
public class Verification {

    public boolean verifyUser(String userId,String token){
        log.info("校验已破解 userId = {},token = {}",userId,token);
        return true;
    }
}
