package Day04;

import java.util.*;

public class BubbleSort {

	public static void BubbleSort(int[] arr) {

		int count = 0;
		int noofswap = 0;
		boolean swap ;

		for (int i = 0; i < arr.length - 1; i++) {
			
			count++;
			swap = false;

			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					noofswap ++;
					swap = true;
				}
			}
			
			if(!swap) {
				break;
			}
		}
		
		System.out.println("number of Itterations in this array :"+count);
		System.out.println("no of swap :"+noofswap);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = 6;
		int[] arr = new int[size];

		System.out.println("Enter Array element :");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		BubbleSort.BubbleSort(arr);

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

}
