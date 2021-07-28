package by.training.java_intro.s02_algoritmization.t02_multidimensional_array;

import java.util.Random;

/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */
public class Task14 {
	public static void main(String[] args) {
		Random random = new Random();
		int m = random.nextInt(19) + 2;
		int n = random.nextInt(19) + 2;
		int[][] array = new int[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (j > i)
					array[i][j] = 1;

		printArray("Готово", array);

	}

	public static void printArray(String message, int[][] array) {
		System.out.println(message);
		for (int[] i : array) {
			System.out.print("[ ");
			for (int j : i)
				System.out.print(j + " ");
			System.out.println("]");
		}
	}
}
