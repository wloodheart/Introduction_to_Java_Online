package by.training.wlood.s02_algoritmization.t01_onedimensional_array;

/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task1 {
	public static void main(String[] args) {
		int k = 5;
		int sum = 0;
		int[] a = { 60, 8, 15, 7, 85, 10, 0, 76, 70, 68, 76, 85, 25, 69, 2, 56, 63, 62, 55, 36 };

		for (int j : a)
			if (j % k == 0)
				sum += j;

		System.out.println("Сумма элементов кратных " + k + " : " + sum);
	}
}