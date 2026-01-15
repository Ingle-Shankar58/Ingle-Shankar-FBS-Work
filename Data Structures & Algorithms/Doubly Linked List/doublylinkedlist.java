package Day14_DoublyLinkedList;

public class doublylinkedlist {

	Node start;
	Node end;
	int size = 0;

	public doublylinkedlist() {
		super();
		this.start = null;
		this.end = null;
	}

	public boolean isEmpty() {

		if (start == null) {
			return true;
		}
		return false;
	}

	void insertAtPosition(int ele, int pos) {

		// Negative or zero position is invalid
		if (pos <= 0) {
			System.out.println("Invalid position");
			return;
		}

		// If position is greater than size, insert at last
		if (pos > size + 1) {
			insertAtLast(ele);
			return;
		}

		Node newNode = new Node(ele);

		// Insert at beginning
		if (pos == 1) {
			if (isEmpty()) {
				start = newNode;
				end = newNode;
			} else {
				newNode.next = start;
				start.prev = newNode;
				start = newNode;
			}
			size++;
			return;
		}

		// Insert at last (pos == size + 1)
		if (pos == size + 1) {
			insertAtLast(ele);
			return;
		}

		// Insert in between
		Node temp = start;
		int c = 1;

		while (c < pos - 1) {
			temp = temp.next;
			c++;
		}

		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next.prev = newNode;
		temp.next = newNode;
		size++;
	}

	void displaystart() {

		if (!isEmpty()) {

			Node temp = start;

			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}

	}

	void displaylast() {

		if (!isEmpty()) {

			Node temp = end;

			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getPrev();
			}
		}

	}

	void insertAtLast(int ele) {

		Node newNode = new Node(ele);

		if (isEmpty()) {

			start = newNode;
			end = newNode;
			size++;
			return;

		}

		newNode.prev = end;
		end.next = newNode;
		end = newNode;
		size++;
	}

	void delete(int pos) {

		if (isEmpty()) {
			System.out.println("List is Empty !!!");
			return;
		}

		if (pos <= 0 || pos > size) {
			System.out.println("Invalid Position !!!");
			return;
		}

		if (pos == 1) {
			if (size == 1) {
				start = null;
				end = null;
			} else {
				start = start.next;
				start.prev = null;
			}
			size--;
			return;

		}

		if (pos == size) {
			end = end.prev;
			end.next = null;
			size--;
			return;
		}

		
		if (pos <= size / 2) {
			int c = 1;
			Node temp = start;

			while (c < pos) {
				c++;
				temp = temp.next;
			}

			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;

			temp.next = null;
			temp.prev = null;

			size--;

		} else {
			int c = size;
			Node temp = end;

			while (c > pos) {
				c--;
				temp = temp.prev;
			}

			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;

			temp.next = null;
			temp.prev = null;

			size--;
		}

	}

	int getSize() {
		return size;
	}

}
