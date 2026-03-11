package com.example.demo;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("123");
		Connection conn = null;
		ResultSet rst = null;
		//
		System.out.println("連線");
		String i = "";
		try {
		conn = JDBCUtils.getConnection();
		String sql = "select userName from dba_users where userName = 'SYS'";
		PreparedStatement statement = conn.prepareStatement(sql);
		rst = statement.executeQuery();
		while (rst.next()) {
			i = rst.getString(1);
			System.out.println("回傳 :" + i);
		}
		statement.close();
		System.out.println("close");
		} catch(SQLException e) {
			System.out.println("DropDB Exception :" + e.toString());
		}
	}

}
