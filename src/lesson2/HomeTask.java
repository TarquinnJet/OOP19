//1. int sum(int val);который возвращает сумму всех цифр числа.
//ѕример: 
//int sum = sum(1234); // sum = 1 + 2 + 3 + 4 = 10
//
//2. Ќаписать рекурсивный метод void revers(int val); который выводит в консоль число наоборот.
//ѕример: revers(1234); //в консоли 4321
//3.* Ќаписать рекурсивный метод int revers(int val) который возвращает число - зеркальное отображение аргумента
//ѕример: int res = revers(1234); res = 4321

//сортировка Ўелла. quicksort, хвостова€ рекурси€, рекурси€ факториал, рекурси€ степень числа
//написать р-медод, который заполна€ем массив рекурсивно, сумма. сумма числа.12363
//вывести число в обратном пор€дке в консоль. и то же, чтолько готовым интом.
//

package lesson2;

public class HomeTask {

	public static void main(String[] args) {
		System.out.println("рекурси€. (int)сумма цифр заданного числа : "
				+ recursivNumbersSummary(123456789));
		recursivPrintReversivAsString(1023029004);
		System.out.println("рекурси€. вывод числа (int)наоборот : "
				+ recursivPrintReversivAsInt(1203460001) + ". Oно же +1 : "
				+ (int) (recursivPrintReversivAsInt(1203460001) + 1));
		int[] array = new int[12];
		lesson2.Task1Recurs.recursivArrayFillByRandoms(array, 0);
		System.out
				.print("массив заполнен рекурсивно случайными числами 1..9 : ");
		lesson1.Task2.printArray(array);
		aShellSort(array);
		System.out.print("массив отсортирован методом Ўелла. рекурсивно : ");
		lesson1.Task2.printArray(array);
		int[] arr = { 1, 2, 3 };
		possibleCombinationsOfNumbers(arr);
		// [] [] arrb =  {1,2,3},{2,3,4},{5,4,1};
	}
	@SuppressWarnings("unused")
	private static void find(int[][] arr,int k, int sum){
		  if (k== arr.length){
		   System.out.println(sum);
		  }else{
		   for(int el: arr[k]){
		    find (arr, k+1, sum+el);
		   }
		  }
		 }
	static void doWork(int[] arr, int posOfSwap) {
		if (posOfSwap == arr.length-1) {
			lesson1.Task2.printArray(arr);
			return;
		}
		
		for (int i = posOfSwap; i < arr.length; i++) {
			lesson1.Task2.swap(arr, posOfSwap, i);
			doWork(arr, posOfSwap + 1);
			lesson1.Task2.swap(arr, posOfSwap, i);
		}

	}

	private static void possibleCombinationsOfNumbers(int[] arr) {
		int posOfSwap = 0;
		// int swapCount = 0;
		doWork(arr, posOfSwap);
	}

	private static void aShellSort(int[] arr) {
		int compareStep = arr.length / 2;
		while(compareStep>0){
			for(int i=0;i<arr.length-compareStep;i++){
				int l=i;
				while (l>=0&&arr[l]>arr[l+compareStep]){
					lesson1.Task2.swap(arr, l, l + compareStep);
					l-=compareStep;
				}
			}
		}//сверху шелла вариант еще
		int swapCount = 1;
		while (swapCount != 0) {
			swapCount = 0;
			for (int i = 0; i < arr.length - compareStep; i++) {
				if (arr[i] > arr[i + compareStep]) {// надо докрутить чтобы при
													// свапе провер€лись в
													// обратную сторону элементы
													// по шагу сравнени€.
					lesson1.Task2.swap(arr, i, i + compareStep);
					swapCount++;
				}
			}
			if (compareStep != 1)
				compareStep = compareStep / 2;
		}
	}

	private static int recursivPrintReversivAsInt(int i) {
		if (i != 0) {
			int degree = numberDegree(i, 0);
			int number = i % 10;
			i = number * (int) Task1Recurs.recursivPowTrenar(10, degree)
					+ recursivPrintReversivAsInt((i - i % 10) / 10);
		}
		return i;
	}

	static int numberDegree(int i, int order) {
		if (i < 10) {
			return order;
		}
		return order = numberDegree(i / 10, order + 1);
	}

	private static void recursivPrintReversivAsString(int i) {
		System.out.print(i % 10 + " ");
		if (((i - i % 10) / 10) > 0) {
			recursivPrintReversivAsString((i - i % 10) / 10);
		} else
			System.out.println(" - рекурси€. вывод числа строкой наоборот");
	}

	public static int recursivNumbersSummary(int number) {
		if (number != 0) {
			number = number % 10
					+ recursivNumbersSummary((number - number % 10) / 10);
		}
		return number;
	}
}
