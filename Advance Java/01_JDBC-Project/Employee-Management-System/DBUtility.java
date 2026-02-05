package com.Employee;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {
	private static String cName;
	private static String url;
	private static String uName;
	private static String Pass;
	
	public static void databaseConfig() {
		
		try {
			
			FileInputStream fis = new FileInputStream(".//Recources//databaseinfo.properties");
			Properties pro = new Properties();
			pro.load(fis);
			
			cName = pro.getProperty("classname");
			url = pro.getProperty("url");
			uName = pro.getProperty("username");
			Pass = pro.getProperty("password");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getSQLConnection() {
		
		databaseConfig();
		
		
		try {
			Class.forName(cName);
			
			Connection con = DriverManager.getConnection(url,uName,Pass);
			return con;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	public static void resourcesRelease(ResultSet rs, PreparedStatement psmt, Connection con) {
		
		try {
			rs.close();
			psmt.close();
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void resourcesRelease(PreparedStatement psmt, Connection con) {
		try {
			psmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
