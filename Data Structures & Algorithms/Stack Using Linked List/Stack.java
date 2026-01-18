package StackUsingLinkedList;

public class Stack<T> {

	Node<T> start;

	public Stack() {
		super();
		this.start = null;
	}

	boolean isEmpty() {
		if (start == null)
			return true;
		else
			return false;
	}

	void Push(T data) {

		Node<T> newNode = new Node<T>(data);
		if (isEmpty()) {
			start = newNode;
		} else {

			newNode.setNext(start);
			start = newNode;
		}
	}

	void Pop() {
		if (isEmpty()) {
			System.out.println("This Stack is Empty !!!");
			return;
		} else {

			start = start.next;
		}
	}

	void Peek() {
		if (isEmpty()) {
			System.out.println("This Stack is Empty !!!");
			return;
		} else {

			System.out.println(start.getData());
		}

	}

}
