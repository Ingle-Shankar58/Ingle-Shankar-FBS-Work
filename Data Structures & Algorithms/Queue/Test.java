package Day09_Queue;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue(5);
		
		boolean flag =  true;
		
		while(flag) {
			
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			int ch = sc.nextInt();
			
			switch(ch) {
			
			case 1 :
				
				System.out.println("Enter Data :");
				int data = sc.nextInt();
				q.enque(data);
				break;
			case 2 :
				int x = q.deque();
				System.out.println("Remove SucessFully : "+x);
				break;
			case 3 :
				q.display();
				break;
			case 4 :
				flag = false;
				break;
				
			}
			
		}
		
	}

}
