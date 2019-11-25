package com.junit.junittest.test;

import com.junit.junittest.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fhj
 * @version 1.0
 * @ClassName LogisticsResolver
 * @Description TODO  spring 实现策略模式
 * @date 2019/11/21  11:27
 **/
@Component
public class LogisticsResolver  implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private Map<String,Sign> map =new HashMap<>();



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String,Sign> beanMap = this.applicationContext.getBeansOfType(Sign.class);
        for (String key :beanMap.keySet()){
            Sign sign = beanMap.get(key);
            this.map.put(sign.companyCode(),sign);
        }
    }

    public Object getHandler(String key){
        return map.get(key);
    }
}
