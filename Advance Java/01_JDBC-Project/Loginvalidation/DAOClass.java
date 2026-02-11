package com.LoginVAlidation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class DAOClass {

	public boolean signUp(String userName, String password) {

		Connection con = null;

		try {

			con = DBConnection.getConnection();
			String insertQuery = "insert into  users ( userName, password) values (?,?)";
			PreparedStatement p = con.prepareStatement(insertQuery);
			p.setString(1, userName);
			p.setString(2, password);

			int row = p.executeUpdate();

			return row > 0;

		} catch (Exception e) {
			System.out.println("This userName is All Ready Exits !!!!");
		}

		return false;

	}

	public boolean signIn(String userName, String password) {

		Connection con = null;

		try {

			con = DBConnection.getConnection();
			String selectQuery = "SELECT * FROM users WHERE userName = ? AND password = ?\r\n" + "";
			PreparedStatement p = con.prepareStatement(selectQuery);

			p.setString(1, userName);
			p.setString(2, password);

			ResultSet rs = p.executeQuery();

			
			return rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public boolean resetPass(String userName, String newpassword) {

		Connection con = null;

		try {

			con = DBConnection.getConnection();

			String sql = "UPDATE users SET password=? WHERE username=?";
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, newpassword);
			p.setString(2, userName);
			
			
			int row = p.executeUpdate();

			return row > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

}
