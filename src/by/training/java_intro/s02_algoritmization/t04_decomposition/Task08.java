package by.training.java_intro.s02_algoritmization.t04_decomposition;

/*
Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */
public class Task08 {
	public static void main(String[] args) {
		int[] a = { -34, 11, 18, 83, -59, -17, -7, 20, -28, 51, -44, 35, 52, -44, 25, 4, 1, -73, 90, -35 };

		threeElementsSum(a, 0);
	}

	static void threeElementsSum(int[] a, int k) {
		int sum = 0;

		for (int i = k, j = 0; i < a.length; i++, j++) {
			if (j < 3)
				sum += a[k + i];
			else {
				System.out.println(sum);
				sum = 0;
				j = 0;
			}
		}
	}
}