package Day04;

import java.util.*;

public class SelectionSort {
	
	public static void SelectionSort(int[]arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			int min = arr[i];
			int midx = i;
			
			for(int j = i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min = arr[j];
					midx=j;
				}
				arr[midx]=arr[i];
				arr[i]=min;
			}
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = 6;
		int[] arr = new int[size];

		System.out.println("Enter Array element :");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		SelectionSort.SelectionSort(arr);

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

	}

}
