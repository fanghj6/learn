package com.junit.junittest.common;

import org.dbunit.DBTestCase;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author fhj
 * @version 1.0
 * @ClassName DBUnitCaseTest
 * @Description TODO
 * @date 2019/9/22  17:30
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DBUnitCaseTest extends DBTestCase {

    @Resource
    DataSource dataSource;
    IDatabaseConnection iDatabaseConnection;


    @Override
    protected IDataSet getDataSet() throws Exception {
        return iDatabaseConnection.createDataSet();
    }

    @Before
    public void before() throws Exception{
        iDatabaseConnection = new DatabaseConnection(dataSource.getConnection());

    }

    @Test
    public void testPartialExport() throws DataSetException, IOException {
//        QueryDataSet queryDataSet = new QueryDataSet(iDatabaseConnection);
//        queryDataSet.addTable("user", "select * from user limit 0,5 ");
//        FlatXmlDataSet.write(queryDataSet, new FileOutputStream("src/test/resources/data/user-setup.xml"));
    }
}
