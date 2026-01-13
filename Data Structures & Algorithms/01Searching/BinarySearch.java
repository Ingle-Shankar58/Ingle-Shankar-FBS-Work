package Day03;

import java.util.*;

public class BinarySearch {

	public static int binarySearch(int[] arr, int x) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int mid = (start + end) / 2;

			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return -1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 10;

		int[] arr = new int[x];

		System.out.println("Enter Array Element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Serch Element");
		int n = sc.nextInt();

		int result = BinarySearch.binarySearch(arr, n);

		if (result != -1) {
			System.out.println("Element is Found At " + result + " Index");
		} else {
			System.out.println("Element is not Found");
		}

	}

}
