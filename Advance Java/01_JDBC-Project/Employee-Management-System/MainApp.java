package com.Employee;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        EmployeeManagement empMge = new EmployeeManagement();

        System.out.println("======================================");
        System.out.println("      EMPLOYEE MANAGEMENT SYSTEM       ");
        System.out.println("======================================");

        do {
            System.out.println("\n------------- MAIN MENU ---------------");
            System.out.println(" 1 | Add Employee                    ");
            System.out.println(" 2 | Search Employee (By ID)         ");
            System.out.println(" 3 | Update Employee Salary (By ID)  ");
            System.out.println(" 4 | Delete Employee (By ID)         ");
            System.out.println(" 5 | Display All Employees           ");
            System.out.println(" 0 | Exit                            ");
            System.out.println("--------------------------------------");
            System.out.print("Enter Your Choice ==> ");

            choice = sc.nextInt();

            System.out.println("--------------------------------------");

            switch (choice) {

                case 1:
                    empMge.addEmp();
                    break;

                case 2:
                    empMge.searchEmp();
                    break;

                case 3:
                    empMge.updateEmp();
                    break;

                case 4:
                    empMge.deleteEmp();
                    break;

                case 5:
                    empMge.displayAllEmp();
                    break;

                case 0:
                    System.out.println("Thank you! Exiting Application...");
                    break;

                default:
                    System.out.println("❌ Invalid Choice! Please Try Again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
