package by.training.wlood.s02_algoritmization.t02_multidimensional_array;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task02 {
	public static void main(String[] args) {
		int[][] array = { { 4, 2, 9, 6, 9, 3, 5, 9, 1 }, { 0, 3, 9, 0, 0, 4, 8, 6, 7 }, { 5, 6, 7, 8, 9, 5, 6, 1, 0 },
				{ 5, 6, 2, 0, 7, 1, 3, 1, 7 }, { 8, 3, 5, 4, 7, 9, 7, 2, 7 }, { 4, 8, 6, 7, 8, 3, 5, 4, 8 },
				{ 9, 0, 3, 0, 1, 6, 9, 2, 6 }, { 0, 0, 3, 8, 6, 9, 6, 9, 9 }, { 0, 4, 6, 2, 3, 8, 2, 4, 3 } };

		System.out.print("Значения стоящие на диагонали квадратной матрицы: [ ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i][i] + " ");
		System.out.println("]");
	}
}