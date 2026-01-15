package Day12_Linkedlist;

public class linkedlist {

	Node start;
	int size = 0;

	public linkedlist() {
		super();
		this.start = null;
	}

	boolean ifEmpty() {
		if (start == null) {
			return true;
		} else
			return false;
	}

	public void addFirst(int ele) {

		if (ifEmpty()) {
			start = new Node(ele);
			size++;

		} else {
			Node temp1 = new Node(ele);
			temp1.setNext(start);
			start = temp1;
			size++;
		}
	}

	public int removeFirst() {

		if (ifEmpty()) {
			System.out.println("List is empty !!!");
			return -1;
		}
		int data = start.data;
		start = start.next;
		size--;
		return data;
	}

	public void AddLast(int ele) {
		Node temp = new Node(ele);

		if (ifEmpty()) {
			start = temp;
			size++;

		} else {
			size++;

			Node CurrentIdx = start;

			while (CurrentIdx.getNext() != null) {
				CurrentIdx = CurrentIdx.getNext();

			}

			CurrentIdx.setNext(temp);

		}

	}

	public int removeLast() {

		if (start == null) {
			System.out.println("List is Empty !!!");

		} else if (start.next == null) {

			int d1 = start.data;
			start = null;
			size--;
			return d1;
		}

		Node currlast = start.next;
		Node currSecond = start;

		while (currlast.next != null) {
			currlast = currlast.next;
			currSecond = currSecond.next;
		}
		int data = currlast.data;
		currSecond.next = null;
		size--;
		return data;

	}

	void insertAtPosition(int ele, int pos) {

		Node temp = new Node(ele);

		if (ifEmpty()) {
			start = temp;
			size++;
			System.out.println("This List is empty so Add At First Position !!!");
			return;

		}
		if (pos == 1) {

			temp.setNext(start);
			start = temp;
			size++;
			return;

		}
		Node temp1 = start;
		int c = 1;

		while (temp1.getNext() != null && c < pos - 1) {
			temp1 = temp1.getNext();
			c++;
		}

		if (c < pos - 1) {
			System.out.println("Invalid Position! Data added at last.");
		}

		temp.setNext(temp1.getNext());
		temp1.setNext(temp);
		size++;

	}

	void removeAtPosition(int pos) {

		if (pos < getSize()) {

			if (ifEmpty()) {
				System.out.println("This list is Empty");
			} else if (pos <= 0) {
				System.out.println("Invalid Position");

			} else if (pos == 1) {
				start = start.getNext();
				size--;
			} else {

				Node temp = start;
				int c = 1;
				while (temp.getNext() != null && c < pos - 1) {
					temp = temp.getNext();
					c++;
				}
				if (temp.getNext() == null) {
					System.out.println("Invalid position");
				} else {
					temp.setNext(temp.getNext().getNext());
					size--;
				}
			}
		} else {
			System.out.println("Invalid Position !!");
		}
	}

	void display() {

		if (!ifEmpty()) {

			Node temp = start;

			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}

	public int getSize() {
		return size;

	}

	void indexData(int index) {

		if (index < getSize()) {

			if (ifEmpty()) {
				System.out.println("This List Is Empty !!!!");
				return;
			}

			if (index == 0) {
				System.out.println(start.getData());
				return;
			}

			int count = 1;

			Node temp = start;

			while (count <= index && temp.next != null) {

				temp = temp.next;
				count++;
			}

			System.out.println(temp.data);

		} else {
			System.out.println("Invalid Index !!!");
		}

	}

	static boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	void displayPrimeNo() {

		Node temp = start;

		int c = 0;

		while (temp != null) {

			if (isPrime(temp.getData())) {

				System.out.println(temp.getData());

			}

			temp = temp.getNext();
		}

	}

	linkedlist copyList() {

		linkedlist newList = new linkedlist(); // copy list

		if (ifEmpty()) {
			return newList;
		}

		Node temp = start;

		while (temp != null) {
			newList.AddLast(temp.getData()); // data copy
			temp = temp.getNext();
		}

		return newList;
	}

	void bubbleSortWithoutChangingOriginal() {

		linkedlist copy = copyList(); // copy list

		copy.bubbleSort(); // sorting only on copy
		copy.display();

	}

	void bubbleSort() {

		if (ifEmpty()) {
			System.out.println("List is Empty !!!");
			return;
		}

		boolean swaped;
		Node temp;
		Node last = null;

		do {
			swaped = false;
			temp = start;

			while (temp.getNext() != last) {
				if (temp.getData() > temp.next.data) {
					int t = temp.data;
					temp.data = temp.next.data;
					temp.next.data = t;

					swaped = true;

				}

				temp = temp.next;
			}
			last = temp.next;

		} while (swaped);

	}

	int DataIndex(int data) {

		if (ifEmpty()) {
			System.out.println("List is Empty !!!");
			return -1;
		}

		Node temp = start;
		int c = 0;

		while (temp != null) {

			if (temp.data == data) {
				return c;
			}

			temp = temp.next;
			c++;
		}

		return -1;

	}

	void reveseList() {

		linkedlist copy = copyList();

		copy.reverse(copy.start);
	}

	void reverse(Node start) {

		Node Prev = null;
		Node Cur = start;
		Node Next = null;

		while (Cur != null) {

			Next = Cur.next;
			Cur.next = Prev;

			Prev = Cur;
			Cur = Next;

		}

		while (Prev != null) {
			System.out.println(Prev.data);

			Prev = Prev.next;
		}

	}

}