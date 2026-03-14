package Com.client;

import java.util.*;

import Com.aspect.ObjectCreater;
import Com.serviceLayer02.LoginValidationService;

public class Client {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserName ");
		String userName = sc.nextLine();
		String password = sc.nextLine();
		
		LoginValidationService login = ObjectCreater.CreateObject();
		login.createUser(userName, password);
		
		boolean value = login.validUser(userName, password);
		if(value) {
			System.out.println("Welcome !!!!");
		}else {
			System.out.println("Please Try Again !!!!");
		}
		
		
	}

}
