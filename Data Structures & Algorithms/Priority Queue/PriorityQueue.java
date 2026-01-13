package Day10_Priority;

public class PriorityQueue {

	int arr[];
	int front;
	int rare;

	PriorityQueue(int size) {
		arr = new int[size];
		this.front = -1;
		this.rare = -1;
	}

	public boolean isEmpty() {
		return front == -1 && rare == -1;
	}

	public boolean isFull() {
		if ((rare == arr.length - 1 && front == 0) || (rare + 1 == front))
			return true;
		else
			return false;
	}

	public void enque(int ele) {

		if (isFull()) {
			System.out.println("Queue is Full");
			return;
		}

		if (front == -1) {
			front = 0;
			rare = 0;
			arr[rare] = ele;
			return;
		}

		int i = rare;

		while (i >= front && arr[i] > ele) {
			arr[i + 1] = arr[i];
			i--;
		}

		arr[i + 1] = ele;
		rare++;
	}

	public int deque() {

		int ele = 0;
		if (isEmpty()) {
			System.out.println("This Queue Is Empty");
			return -1;
		}

		ele = arr[front]; // ✅ YEH LINE ADD KARO

		if (rare == front) {
			rare = -1;
			front = -1;
		} else if (front == arr.length - 1) {
			front = 0;
		} else {
			front++;
		}

		return ele;
	}

	void display() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}

		int i = front;
		while (true) {
			System.out.println(arr[i]);

			if (i == rare)
				break;

			if (i == arr.length - 1)
				i = 0;
			else
				i++;
		}
	}

}
