package com.junit.junittest.service;

import com.junit.junittest.db.User;

/**
 * @author fhj
 * @version 1.0
 * @ClassName UserService
 * @Description TODO
 * @date 2019/9/7  13:18
 **/
public interface UserService {

     User selectByPrimaryKey(Integer id);
}
