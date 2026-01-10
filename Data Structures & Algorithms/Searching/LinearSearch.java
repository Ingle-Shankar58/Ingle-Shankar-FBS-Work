package Day02;

import java.applet.*;
import java.util.Scanner;

public class LinearSearch {

	static int SearchElement(int[] arr, int x) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter Element in Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Search Element");
		int y = sc.nextInt();

		int result = LinearSearch.SearchElement(arr, y);

		if (result != -1) {
			System.out.println("found");
		} else {
			System.out.println("not sound");
		}
	}

}
