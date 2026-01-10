package Day03;

import java.util.*;

public class FindFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = 10;

		int[] arr = new int[size];

		System.out.println("Enter Array Element:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 1;

			if (arr[i] == -1)
				continue;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}

			System.out.println(arr[i] + " -> " + count);
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
