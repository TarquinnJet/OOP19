package lesson2;

public class Task1Recurs {

	public static void main(String[] args) {
		System.out.println("рекурсия. факториал.тренарная запись : "
				+ recursivFactorialTrenar(3));
		System.out.println("рекурсия. факториал. : " + recursivFactorial(20));
		int[] arr = { 1, 3, 4, 5, 6 };
		System.out
				.println("рекурсия. поиск значения. вывод позиции. тренарная запись : "
						+ recursivSearchTrenar(arr, 0, 5));
		System.out.println("рекурсия. поиск значения. вывод позиции. : "
				+ recursivSearch(arr, 0, 66));
		int foundationDegree = 5;
		System.out
				.println("рекурсия. число в степени. основание 5. тренарная запись : "
						+ recursivPowTrenar(foundationDegree, 2));
		System.out.println("рекурсия. число в степени. основание 5 : "
				+ recursivPow(foundationDegree, 4));
		System.out
				.println("рекурсия. Фибоначчи. вывод указанного элемента последовательности (нулевой элемент считается) : "
						+ recursivFibonacci(10));
		int[] array = new int[10];
		lesson1.Task2.printArray(array);
		recursivArrayFillByRandoms(array, 0);
		lesson1.Task2.printArray(array);
		recursivInsertionSort(array, 0);
		lesson1.Task2.printArray(array);
	}

	public static long recursivFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * recursivFactorial(n - 1);
		}
	}

	public static int recursivFactorialTrenar(int n) {
		return n == 1 ? 1 : n * recursivFactorialTrenar(n - 1);

	}

	public static int recursivSearchTrenar(int[] arr, int start, int el) {
		return start == arr.length ? -1 : arr[start] == el ? start
				: recursivSearchTrenar(arr, start + 1, el);
	}

	public static int recursivSearch(int[] arr, int idx, int el) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == el) {
			return idx;
		} else {
			return recursivSearch(arr, idx + 1, el);
		}
	}

	public static long recursivPowTrenar(int b, int n) {

		return n == 0 ? 1 : b * recursivPowTrenar(b, n - 1);

	}

	public static long recursivPow(int b, int n) {
		if (n == 0)
			return 1;
		else {
			return b * recursivPow(b, n - 1);
		}

	}

	public static int recursivFibonacci(int pos) {
		if (pos == 0)
			return 0;
		if (pos == 1)
			return 1;
		return recursivFibonacci(pos - 1) + recursivFibonacci(pos - 2);

	}

	public static void recursivArrayFillByRandoms(int[] array, int pos) {
		if (pos >= array.length || pos < 0) {
			return;
		}
		array[pos] = (int) (Math.random() * 10);
		recursivArrayFillByRandoms(array, pos + 1);
	}

	public static void recursivInsertionSort(int[] arr, int i) {
		if (i >= arr.length || i < 0) {
			return;
		}
		int minIdx = i;
		for (int j = i; j < arr.length; j++) {
			if (arr[j] < arr[minIdx]) {
				minIdx = j;
			}
		}
		lesson1.Task2.swap(arr, minIdx, i);
		recursivInsertionSort(arr, i + 1);
	}

}
