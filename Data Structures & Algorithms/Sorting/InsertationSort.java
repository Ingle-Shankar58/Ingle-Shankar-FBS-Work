package Day05;

import java.util.*;

public class InsertationSort {

	public static void InsertationSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int x = arr[i];
			int j = i - 1;

			while (j >= 0) {
				if (arr[j] > x) {
					arr[j + 1] = arr[j];
					j--;
				} else {
					break;
				}
			}
			arr[j + 1] = x;

		}
		


	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter arr index " + i + ":");
			arr[i] = sc.nextInt();

		}
		
		InsertationSort.InsertationSort(arr);
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
