package lesson1;

public class Task2 {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 5, 3, 8, 0, 9, 1, 2, 6 };
		bubbleSort(arr);
		selectionSort(arr);
		printArray(arr);
		insertionSort(arr);
		printArray(arr);
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {

			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				swap(arr, j, j - 1);
			}
		}
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void bubbleSort(int[] arr) {
		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;

	}

}
