package by.training.wlood.s02_algoritmization.t03_sorth;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */
public class Task1 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int[] arr2 = { 4, 5, 6 };
		int k = 3;

		System.arraycopy(arr1, k, arr1, k + arr2.length, arr1.length - arr2.length - k);
		System.arraycopy(arr2, 0, arr1, k, arr2.length);

		printArray(arr1);
	}

	public static void printArray(int[] array) {
		System.out.print("[ ");
		for (int i : array)
			System.out.print(i + " ");
		System.out.println("]");
	}
}