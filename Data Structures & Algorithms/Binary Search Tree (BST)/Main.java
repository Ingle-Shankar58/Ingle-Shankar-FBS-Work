package Day16_Tree_BST;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		boolean flag = true;

		Scanner sc = new Scanner(System.in);
		BST<String> list = new BST<String>();

		while (flag) {

			System.out.println("1. Insert ");
			System.out.println("2. Display");
			System.out.println("3. Delete ");
			System.out.println("0.Exit ");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("Enter Data :");
				sc.nextLine(); // clear buffer
				

				String data = sc.nextLine();
				list.insertData(data);
				break;
			case 2:
				list.Display();
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter Data :");
				String data1 = sc.nextLine();
				list.deletedata(data1);
				break;
			case 0:
				flag = false;
				break;
			}
		}
	}

}
