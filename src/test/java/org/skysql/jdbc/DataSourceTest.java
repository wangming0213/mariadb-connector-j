package org.skysql.jdbc;

import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: marcuse
 * Date: Sep 1, 2009
 * Time: 7:03:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataSourceTest {
    @Test
    public void testDrizzleDataSource() throws SQLException {
        DataSource ds = new MySQLDataSource(DriverTest.host,3306,"test");
        Connection connection = ds.getConnection("root", null);
        assertEquals(connection.isValid(0),true);
    }
    @Test
    public void testDrizzleDataSource2() throws SQLException {
        DataSource ds = new MySQLDataSource(DriverTest.host,3306,"test");
        Connection connection = ds.getConnection("root","");
        assertEquals(connection.isValid(0),true);
    }
}
