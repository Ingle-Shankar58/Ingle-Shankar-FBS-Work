package Day12_Linkedlist;

import java.util.Scanner;

public class Main {

	public static void main(String[] fargs) {

		linkedlist list = new linkedlist();

		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("1. Add First");
			System.out.println("2. Remove First");
			System.out.println("3. Add Last ");
			System.out.println("4. Remove Last");
			System.out.println("5. Insert At Position");
			System.out.println("6. Remove At Position");
			System.out.println("7. Display");
			System.out.println("8. Get Size Of List");
			System.out.println("9. Index Data");
			System.out.println("10.Display Prime");
			System.out.println("11.Bubble sort  ");
			System.out.println("12.Data Index");
			System.out.println("13.Reverse LinkedList");
			System.out.println("14. Exit");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter data");
				int data = sc.nextInt();
				list.addFirst(data);
				break;

			case 2:
				int d1 = list.removeFirst();
				System.out.println("This Element is Deleted :" + d1);
				break;
			case 3:
				System.out.println("Enter data");
				int data1 = sc.nextInt();
				list.AddLast(data1);
				break;
			case 4:
				int d2 = list.removeLast();
				System.out.println("This Element is Deleted :" + d2);
				break;
			case 5:
				System.out.println("Enter Position ");
				int pos = sc.nextInt();
				System.out.println("Enter Data");
				int data2 = sc.nextInt();
				list.insertAtPosition(data2, pos);
				break;
			case 6:
				System.out.println("Enter Position");
				int pos1 = sc.nextInt();
				list.removeAtPosition(pos1);
				break;
			case 7:
				list.display();
				break;
			case 8:
				System.out.println(list.getSize());
				break;
			case 9:
				System.out.println("Enter Index :");
				int idex = sc.nextInt();
				list.indexData(idex);
				break;
			case 10:
				list.displayPrimeNo();
				break;
			case 11:
				list.bubbleSortWithoutChangingOriginal();
				break;
			case 12:
				System.out.println("Enter Data");
				int x = sc.nextInt();
				int idx = list.DataIndex(x);
				if(idx!=-1) {
					System.out.println("This Data Is Found At This Pos : "+idx);
				}else {
					System.out.println("Data Is Not Found !!!!");
				}
				break;
			case 13:
				list.reveseList();
				break;

			case 14:
				flag = false;
				break;
			}

		}

	}

}
