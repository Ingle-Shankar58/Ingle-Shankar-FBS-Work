package Day07_Stack;

public class Stack {

	int[] arr;
	int top;

	Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	boolean ifFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;
	}

	void push(int ele) {

		boolean res = ifFull();
		if (res == false)
			arr[++top] = ele;
		else
			System.out.println("Stack is Full !!!");

	}

	int pop() {
		if (ifFull() == false) {
			top--;
			return -1;

		} else {
			System.out.println("Stack Under Floww !!");
			return -1;
		}
	}

	int peek() {
		if (ifFull() == false) {
			return arr[top];
		} else {
			return -1;
		}
	}
}
