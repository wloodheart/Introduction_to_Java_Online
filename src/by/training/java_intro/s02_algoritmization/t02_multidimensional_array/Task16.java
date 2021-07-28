package by.training.java_intro.s02_algoritmization.t02_multidimensional_array;

import java.util.Scanner;

/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат. Пример магического квадрата порядка 3:

6 1 8
7 5 3
2 9 4

 */
public class Task16 {
	public static void main(String[] args) {

		int n = enterFromConsole("n >> ");

		while (n < 0)
			n = enterFromConsole("n >> ");

		if (n % 2 != 0)
			generateOddMagicSquare(n);
		else
			generateEvenMagicSquare(n);
	}

	public static void generateEvenMagicSquare(int n) {
		int[][] array = fillingArray(n);

		for (int i = 0, count = 0, transition; i < array.length / 2; i++) {
			if (i < array.length / 2) {
				transition = array[i][i];
				array[i][i] = array[array.length - 1 - count][array.length - 1 - count];
				array[array.length - 1 - count][array.length - 1 - count] = transition;
				count++;
			}
		}
		// Перестановка элементов побочной диагонали

		for (int i = 0, count = 0, transition; i < array.length / 2; i++) {
			if (i < array.length / 2) {
				transition = array[array.length - 1 - count][i];
				array[array.length - 1 - count][i] = array[i][array.length - 1 - count];
				array[i][array.length - 1 - count] = transition;
				count++;
			}
		}

		printArray("Магический квадрат порядка " + n, array);
	}

	public static int[][] fillingArray(int n) {
		int[][] array = new int[n][n];

		for (int i = 0, count = 1; i < array.length; i++)
			for (int j = 0; j < array.length; j++, count++)
				array[i][j] = count;

		return array;
	}

	public static void generateOddMagicSquare(int n) {
		int[][] array = new int[n][n];

		int row = n - 1;
		int col = n / 2;
		array[row][col] = 1;

		for (int i = 2; i <= n * n; i++) {
			if (array[(row + 1) % n][(col + 1) % n] == 0) {
				row = (row + 1) % n;
				col = (col + 1) % n;
			} else
				row = (row - 1 + n) % n;

			array[row][col] = i;
		}

		printArray("Магический квадрат порядка " + n, array);
	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		while (!scanner.hasNextInt()) {
			System.out.print(message);
			scanner.next();
		}
		return scanner.nextInt();
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