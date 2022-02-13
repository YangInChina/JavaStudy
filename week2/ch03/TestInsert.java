package com.boyang.lesson03;

import com.boyang.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author: Boyang
 * @ClassName: com.boyang.lesson03
 * @Description: PreparedStatement
 * @Date: Created in 20:42 2022/2/13
 */
public class TestInsert {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = JdbcUtils.getConnection();

            // 区别 使用 “？” 占位符代替参数
            String sql = "insert into users(id,name,password,email,birthday) values(?,?,?,?,?)";

            st = conn.prepareStatement(sql); // 预编译sql，先写sql，不执行

            // 手动赋值
            st.setInt(1,5);
            st.setString(2,"zby");
            st.setString(3,"123456");
            st.setString(4,"1601860919@qq.com");
            // 注意： sql.Date()       数据库
            //          util.Date       Java new Date).getTime()获得时间戳
            st.setDate(5,new java.sql.Date(new Date().getTime()));

            // 执行
            int i = st.executeUpdate();
            if (i > 0){
                System.out.println("插入成功");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,null);
        }
    }
}
