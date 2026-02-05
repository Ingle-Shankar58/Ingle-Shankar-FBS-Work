package com.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagement {

	int empId;
	String empName;
	double empsal;

	Scanner sc = new Scanner(System.in);

	public void addEmp() {

		System.out.println("Enter EmpID :");
		empId = sc.nextInt();
		System.out.println("Enter EmpName :");
		sc.nextLine();
		empName = sc.nextLine();
		System.out.println("Enter Empsalary :");
		empsal = sc.nextDouble();

		try {
			Connection con = DBUtility.getSQLConnection();
			String insertQuery = "insert into employee values (?,?,?)";
			PreparedStatement psmt = con.prepareStatement(insertQuery);
			psmt.setInt(1, empId);
			psmt.setString(2, empName);
			psmt.setDouble(3, empsal);

			int row = psmt.executeUpdate();
			if (row > 0) {
				System.out.println("==> Data Inserted <===");
			}
			DBUtility.resourcesRelease(psmt, con);
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void searchEmp() {

		System.out.println("Enter EmployeeID :");
		empId = sc.nextInt();

		try {

			Connection con = DBUtility.getSQLConnection();
			String SearchQuery = "select * from employee where id =? ";
			PreparedStatement psmt = con.prepareStatement(SearchQuery);
			psmt.setInt(1, empId);
			ResultSet rs = psmt.executeQuery();

			rs.next();

			empId = rs.getInt(1);
			empName = rs.getString(2);
			empsal = rs.getDouble(3);

			Employee ref = new Employee(empId, empName, empsal);
			System.out.println(ref);

			DBUtility.resourcesRelease(rs, psmt, con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateEmp() {

		System.out.println("Enter EmpID :");
		empId = sc.nextInt();

		System.out.println("Enter New Salary :");
		empsal = sc.nextDouble();

		try {
			Connection con = DBUtility.getSQLConnection();
			String UpdateQuery = "update employee set salary = ? where id = ?";
			PreparedStatement psmt = con.prepareStatement(UpdateQuery);
			psmt.setDouble(1, empsal);
			psmt.setInt(2, empId);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("---Data Update SucessFully-----");
			}

			DBUtility.resourcesRelease(psmt, con);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteEmp() {

		System.out.println("Enter EmpID:");
		empId = sc.nextInt();

		try {

			Connection con = DBUtility.getSQLConnection();
			String deleteQuery = "delete from employee where id = ?";
			PreparedStatement psmt = con.prepareStatement(deleteQuery);
			psmt.setInt(1, empId);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("--- DELETE EMPLOYEE SUCESSFULLY ----");
			}

			DBUtility.resourcesRelease(psmt, con);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void displayAllEmp() {

		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			con = DBUtility.getSQLConnection();

			String query = "select * from employee";
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();

			while (rs.next()) {

				empId = rs.getInt(1);
				empName = rs.getString(2);
				empsal = rs.getDouble(3);

				Employee ref = new Employee(empId, empName, empsal);
				System.out.println(ref);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(rs, psmt, con);
		}
	}
}
