package Day14_DoublyLinkedList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		doublylinkedlist list = new doublylinkedlist();

		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("1. Insert ");
			System.out.println("2. Traverse start");
			System.out.println("3. Traverse Last");
			System.out.println("4. Delete Position");
			System.out.println("5. Size Of List");
			System.out.println("0. Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Position");
				int pos = sc.nextInt();
				System.out.println("Enter Data");
				int data = sc.nextInt();
				list.insertAtPosition(data, pos);
				break;
			case 2:
				list.displaystart();
				break;
			case 3:
				list.displaylast();
				break;
			case 4:
				System.out.println("Enter Position :");
				int pos1 = sc.nextInt();
				list.delete(pos1);
				break;
			case 5:

				System.out.println("Size if List :" + list.getSize());
				break;
			case 0:
				flag = false;
				break;
			}
		}

	}

}
