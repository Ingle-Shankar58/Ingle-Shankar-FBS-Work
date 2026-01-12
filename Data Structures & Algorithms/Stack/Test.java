package Day07_Stack;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Stack obj = new Stack(5);
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			System.out.println("1. Push Mark");
			System.out.println("2. Pop Mark");
			System.out.println("3. Peek Mark");
			System.out.println("4. Exit");

			
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Marks :");
				int mark = sc.nextInt();
				obj.push(mark);
				break;
			case 2:
				obj.pop();
				System.out.println("Top Element id Delete SucessFully !!!");
				break;
			case 3:
				System.out.println("This is the Top Element" + obj.peek());
				break;
			case 4:
				break;
			}

		}

	}

}
