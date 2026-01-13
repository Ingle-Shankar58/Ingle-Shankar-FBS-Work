package Day10_Priority;

import java.util.*;

public class PriorityQueueMain {

	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue(5);
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("1. Except Request  ");
			System.out.println("2. Assign Driver :");
			System.out.println("3. Display All Driver Distance :");
			System.out.println("4. Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Driver Dectination:");
				int dest = sc.nextInt();
				q.enque(dest);
				break;
			case 2:
				int d = q.deque();
				System.out.println("This Cab Is Assign To This Distance Driver :" + d);
				break;
			case 3:
				q.display();
				break;
			case 4:
				flag = false;
				break;
			}
		}

	}

}
