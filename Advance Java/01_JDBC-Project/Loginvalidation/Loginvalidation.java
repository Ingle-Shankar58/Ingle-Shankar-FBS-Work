package com.LoginVAlidation;

import java.util.Scanner;

public class Loginvalidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DAOClass dao = new DAOClass();
		int choice;

		do {
			System.out.println("\n===== LOGIN SYSTEM =====");
			System.out.println("1. Sign Up");
			System.out.println("2. Sign In");
			System.out.println("3. Forgot Password");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter Username: ");
				String suUser = sc.nextLine();
				System.out.print("Enter Password: ");
				String suPass = sc.nextLine();

				if (dao.signUp(suUser, suPass))
					System.out.println("Sign Up Successful!");
				else
					System.out.println("Sign Up Failed!");
				break;

			case 2:
				System.out.print("Enter Username: ");
				String siUser = sc.nextLine();
				System.out.print("Enter Password: ");
				String siPass = sc.nextLine();

				if (dao.signIn(siUser, siPass))
					System.out.println("Login Successful!");
				else
					System.out.println("Invalid Username or Password!");
				break;

			case 3:
				System.out.print("Enter Username: ");
				String fpUser = sc.nextLine();
				System.out.print("Enter New Password: ");
				String fpPass = sc.nextLine();

				if (dao.resetPass(fpUser, fpPass))
					System.out.println("Password Updated Successfully!");
				else
					System.out.println("User not found!");
				break;
			}

		} while (choice != 0);

		sc.close();

	}

}
