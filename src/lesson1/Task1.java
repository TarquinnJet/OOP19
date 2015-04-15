//примитивы, циклы, сортировки ( пузырек, вставка, выборка)

package lesson1;

public class Task1 {

	public static void main(String[] args) {

		int[] arr = { 0, 3, 2, 7, 6, 6, 0, 8, 4, 6 };
		revert(arr);
		Task2.printArray(arr);
	}

	private static void revert(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) { // зеркальная перестановка
			int tmp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			//Task2.swap(arr, arr[arr.length - i - 1], arr[i]);
			arr[arr.length - i - 1] = tmp;// TODO Auto-generated method stub
		}

	}
}