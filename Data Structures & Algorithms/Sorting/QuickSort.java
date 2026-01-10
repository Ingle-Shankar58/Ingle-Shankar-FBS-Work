package Day06;

public class QuickSort {

	public static void QuickSort(int[] arr, int start, int end) {

		if (start < end) {

			int d = QuickSort.dividing(arr, start, end);

			QuickSort.QuickSort(arr, start, d - 1);
			QuickSort.QuickSort(arr, d + 1, end);
		}

	}

	public static int dividing(int[] arr, int start, int end) {

		int pivot = arr[start];

		int i = start + 1;
		int j = end;

		while (i <= j) {

			while (i <= end && arr[i] <= pivot) {

				i++;

			}

			while (i >= 0 && arr[j] > pivot) {
				j--;
			}

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
		}
		int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;

		return j;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6, 2, 7, 8, 4, 9 };

		QuickSort.QuickSort(arr, 0, arr.length - 1);

		for (int x : arr) {
			System.out.println(x);
		}

	}

}
