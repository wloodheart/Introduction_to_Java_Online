package by.training.java_intro.s02_algoritmization.t02_multidimensional_array;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class Task09 {
	public static void main(String[] args) {
		int max = 0;
		int[][] array = { { 4, 2, 9, 6, 9, 3, 5, 9, 1 }, { 0, 3, 9, 0, 0, 4, 8, 6, 7 }, { 5, 6, 7, 8, 9, 5, 6, 1, 0 },
				{ 5, 6, 2, 0, 7, 1, 3, 1, 7 }, { 8, 3, 5, 4, 7, 9, 7, 2, 7 }, { 4, 8, 6, 7, 8, 3, 5, 4, 8 },
				{ 9, 0, 3, 0, 1, 6, 7, 2, 6 }, { 0, 0, 3, 8, 6, 9, 6, 9, 9 }, { 1, 4, 6, 2, 3, 8, 2, 4, 3 } };

		for (int i = 0, tempSum = 0, sum = 0; i < array[0].length; i++, tempSum = 0) {
			for (int j = 0; j < array.length; j++)
				tempSum += array[j][i];
			if (sum < tempSum)
				max = i;
		}
		System.out.println("Найбольшая сумма в столбце " + max);
	}
}
