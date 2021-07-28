package by.training.java_intro.s02_algoritmization.t02_multidimensional_array;

import java.util.Scanner;

/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
public class Task08 {
	public static void main(String[] args) {
		int n;
		int m;
		int temp;
		int[][] array = { { 4, 2, 9, 6, 9, 3, 5, 9, 1 }, { 0, 3, 9, 0, 0, 4, 8, 6, 7 }, { 5, 6, 7, 8, 9, 5, 6, 1, 0 },
				{ 5, 6, 2, 0, 7, 1, 3, 1, 7 }, { 8, 3, 5, 4, 7, 9, 7, 2, 7 }, { 4, 8, 6, 7, 8, 3, 5, 4, 8 },
				{ 9, 0, 3, 0, 1, 6, 9, 2, 6 }, { 0, 0, 3, 8, 6, 9, 6, 9, 9 }, { 1, 4, 6, 2, 3, 8, 2, 4, 3 } };

		n = enterFromConsole("Введите номер столбца n >>");
		while (n < 0 || array[0].length <= n)
			n = enterFromConsole("Такого столбца не существует, повторите попытку: n >>");

		m = enterFromConsole("Введите номер столбца m >>");
		while (m < 0 || array[0].length <= m)
			m = enterFromConsole("Такого столбца не существует, повторите попытку: m >>");

		System.out.println("Происходит перестановка столбцов " + n + " и " + m + "...");

		for (int i = 0; i < array.length; i++) {
			temp = array[i][n];
			array[i][n] = array[i][m];
			array[i][m] = temp;
		}

		for (int[] i : array) {
			System.out.print("[ ");
			for (int j : i)
				System.out.print(j + " ");
			System.out.println("]");
		}
	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int value;

		System.out.print(message);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print(message);
		}
		value = scanner.nextInt();

		return value;
	}
}
