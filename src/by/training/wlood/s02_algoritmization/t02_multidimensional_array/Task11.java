package by.training.wlood.s02_algoritmization.t02_multidimensional_array;

import java.util.Random;

/*
Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */
public class Task11 {
	public static void main(String[] args) {
		int[][] array = new int[10][20];
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(15);
			}
		}

		for (int[] i : array) {
			System.out.print("[ ");
			for (int j : i)
				System.out.print(j + " ");
			System.out.println("]");
		}

		System.out.print("Значений 5 больше трех на строках: ");
		for (int i = 0, q = 0; i < array.length; i++, q = 0) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 5)
					q++;

				if (q > 3)
					System.out.print(i + " ");
			}

		}
	}
}
