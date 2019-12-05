package com.junit.junittest.test.mapstruct.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TestProperties
 * @Description TODO
 * @date 2019/11/28  13:39
 **/
@Configuration
@ConfigurationProperties
@PropertySource("classpath:config/map.properties")
@Component
@Data
public class TestProperties {

    private Map<String,String> initMap;
}
