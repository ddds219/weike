package com.edu.neuq.weike.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Created by abraham on 2015/2/6.
 */
public class DBUtil {
    private static final String URL  = "jdbc:mysql://192.168.0.105/gao";
    private static final String USER = "root";
    private static final String PASSWORD = "raspberry";
    private static Connection conn = null;
    static {
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得数据库的连接
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (ClassNotFoundException e){
             e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return conn;
    }
}
