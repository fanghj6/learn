package com.junit.junittest.config;

import ch.qos.logback.core.db.dialect.DBUtil;
import com.github.springtestdbunit.bean.DatabaseDataSourceConnectionFactoryBean;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.ext.mysql.MySqlConnection;
import org.springframework.context.annotation.Configuration;


/**
 * @author fhj
 * @version 1.0
 * @ClassName DBUnitConfig
 * @Description TODO
 * @date 2019/9/16  15:34
 **/
@Configuration
public class DBUnitConfig {

// oracle 不同用户下有相同表使用
//    @Value("${dbunit.datasource.schema}")
//    private String schema ;
//
//    public DatabaseDataSourceConnectionFactoryBean dbUnitDatabaseConnection(DataSource dataSource){
//        DatabaseDataSourceConnectionFactoryBean connectionFactoryBean = new DatabaseDataSourceConnectionFactoryBean();
//        connectionFactoryBean.setSchema(schema);
//        return connectionFactoryBean;
//    }
}
