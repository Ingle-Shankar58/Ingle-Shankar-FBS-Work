package Day06;

public class MargeSort {

	public static void MargeSort(int[] arr, int Start, int end) {

		if (Start < end) {
			int mid = (Start + end) / 2;

			MargeSort.MargeSort(arr, Start, mid);

			MargeSort.MargeSort(arr, mid+1, end);

			MargeSort.combine(arr, Start, mid, end);

		}
	}

	public static void combine(int[] arr, int start, int mid, int end) {

		int i = start, j = mid + 1, k = 0;
		int[] arr1 = new int[end - start + 1];

		while (i <= mid && j <= end) {

			if (arr[i] < arr[j]) {
				arr1[k++] = arr[i++];
			} else {
				arr1[k++] = arr[j++];
			}
		}

		while (i <= mid) {
			arr1[k++] = arr[i++];
		}
		while (j <= end) {
			arr1[k++] = arr[j++];
		}
		int y = start;

		for (int x = 0; x < arr1.length; x++) {

			arr[y++] = arr1[x];

		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 4, 7, 6, 8 };

		MargeSort.MargeSort(arr, 0, arr.length-1);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
