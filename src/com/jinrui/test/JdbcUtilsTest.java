package com.jinrui.test;

import com.jinrui.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author Jinrui Zhang
 * @create 2021-01-28 13:33
 */
public class JdbcUtilsTest {
    @Test
    public void tesJdbcUtils() {
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
        JdbcUtils.close(connection);
    }
}
