package StackUsingLinkedList;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		Stack<String> stack = new Stack<String>();

		while (flag) {
			System.out.println("===> Stack Operations <===");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("0. EXit");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("Enter Data");
				sc.nextLine();
				String data = sc.nextLine();
				stack.Push(data);
				break;

			case 2:
				stack.Pop();
				break;
			case 3:
				stack.Peek();
				break;
			case 0:
				flag = false;
				break;

			}
		}
	}
}
