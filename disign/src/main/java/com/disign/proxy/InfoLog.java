package com.disign.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author fhj
 * @version 1.0
 * @ClassName InfoLog
 * @Description TODO 信息变动日志
 * @date 2019/9/17  21:23
 **/
@Slf4j
public class InfoLog {

    public boolean recordingLog(String userId,String token){
        log.info("所有访问日志已清除 userId = {},token = {}",userId,token);
        return true;
    }
}
