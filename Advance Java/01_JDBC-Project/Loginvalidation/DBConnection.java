package com.LoginVAlidation;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractic", "root", "Shankar@5858");

		} catch (Exception e) {
			System.out.println("Database connection failed");
		}

		return con;
	}
}
