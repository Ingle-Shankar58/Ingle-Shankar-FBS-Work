package Day08_Stack;

public class Stack {

	char arr[];
	int top;

	Stack(int size) {
		arr = new char[size];
		top = -1;
	}

	public boolean isFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;

	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;

	}

	public void push(char ele) {

		if (!isFull()) {
			arr[++top] = ele;
		} else
			System.out.println("Stack is full !!!");

	}

	public int pop() {

		if (!isEmpty()) {
			int ele = arr[top--];

			return ele;
		} else {
			System.out.println("Stack Is Empty !!!");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[top];
		} else
			return -1;
	}

	public void display() {
		int x = top;
		for (int i = x; i >= 0; i--) {
			System.out.println(arr[x--]);
		}
	}

}
