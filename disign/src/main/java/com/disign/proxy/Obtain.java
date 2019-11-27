package com.disign.proxy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Obtain
 * @Description TODO
 * @date 2019/9/17  21:19
 **/
public interface Obtain {

    /**
     * 获取别人电脑信息
     * @param userId
     * @param token
     * @return
     */
     String getInfo(String userId,String token);
}
