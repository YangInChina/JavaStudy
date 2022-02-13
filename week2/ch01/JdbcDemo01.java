package com.boyang.lesson01;

import java.sql.*;

/**
 * @Author: Boyang
 * @ClassName: com.boyang.lesson01
 * @Description: 我的第一个JDBC程序
 * @Date: Created in 22:45 2022/2/11
 */

public class JdbcDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 加载驱动
        // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Class.forName("com.mysql.cj.jdbc.Driver"); // 固定写法，加载驱动

        // 2. 用户信息和url
        String url = "jdbc:mysql://192.168.1.8:3306/jdbcStudy?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "boyang";
        String password = "123.";

        // 3. 连接成功，返回数据库对象 connection就是数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        // 4. 创建执行SQL的对象 --> statement
        Statement statement = connection.createStatement();

        // 5. 执行SQL的对象 去执行SQL，可能存在结果，查看返回的结果
        String sql = "select * from users;";

        ResultSet resultSet = statement.executeQuery(sql);  //返回的结构集，结果集中封装了全部的查询出来的结构

        while (resultSet.next()){
            System.out.println("id= " + resultSet.getObject("id"));
            System.out.println("name= " + resultSet.getObject("name"));
            System.out.println("pwd= " + resultSet.getObject("password"));
            System.out.println("email= " + resultSet.getObject("email"));
            System.out.println("birthday= " + resultSet.getObject("birthday"));
            System.out.println("=================================");
        }
        // 6. 释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
