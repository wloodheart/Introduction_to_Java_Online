package by.training.wlood.s02_algoritmization.t02_multidimensional_array;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task03 {
	public static void main(String[] args) {
		int[][] array = { { 4, 2, 9, 6, 9, 3, 5, 9, 1 }, { 0, 3, 9, 0, 0, 4, 8, 6, 7 }, { 5, 6, 8, 8, 9, 5, 6, 1, 0 },
				{ 5, 6, 2, 0, 7, 1, 3, 1, 7 }, { 8, 3, 5, 4, 7, 9, 7, 2, 7 }, { 4, 8, 6, 7, 8, 3, 5, 4, 8 },
				{ 9, 0, 3, 0, 1, 6, 9, 2, 6 }, { 0, 0, 3, 8, 6, 9, 6, 9, 9 }, { 0, 4, 6, 2, 3, 8, 2, 4, 3 } };
		int k = 5;
		int p = 4;

		System.out.print("Строка " + k + ": [ ");
		for (int i : array[k])
			System.out.print(i + " ");
		System.out.println("]");

		System.out.print("Столбец " + p + ": [ ");
		for (int[] i : array)
			System.out.print(i[p] + " ");
		System.out.println("]");
	}
}