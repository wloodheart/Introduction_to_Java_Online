package by.training.java_intro.s02_algoritmization.t02_multidimensional_array;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task01 {
	public static void main(String[] args) {
		int[][] array = { { 4, 2, 9, 6, 9, 3, 5, 9, 1, 5, 6, 2, 0, 7, 1, 3, 1, 7 },
				{ 0, 3, 9, 0, 0, 4, 8, 6, 7, 8, 3, 5, 4, 7, 9, 7, 2, 7 },
				{ 5, 6, 7, 8, 9, 5, 6, 1, 0, 4, 8, 6, 7, 8, 3, 5, 4, 8 } };

		for (int i = 1; i < array[0].length; i += 2) {
			if (array[0][i] > array[array.length - 1][i]) {
				System.out.print("Столбец " + i + ": [ ");
				for (int[] j : array)
					System.out.print(j[i] + " ");
				System.out.println("]");
			}
		}
	}
}
