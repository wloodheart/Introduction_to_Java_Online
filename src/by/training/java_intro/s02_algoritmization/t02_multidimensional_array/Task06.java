package by.training.java_intro.s02_algoritmization.t02_multidimensional_array;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

[ 1 1 1 1 1 1 1 1 ]
[ 0 1 1 1 1 1 1 0 ]
[ 0 0 1 1 1 1 0 0 ]
[ 0 0 0 1 1 0 0 0 ]
[ 0 0 0 1 1 0 0 0 ]
[ 0 0 1 1 1 1 0 0 ]
[ 0 1 1 1 1 1 1 0 ]
[ 1 1 1 1 1 1 1 1 ]

 */

public class Task06 {
	public static void main(String[] args) {
		int n = 10;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= i && n - j >= i + 1 || i >= n / 2 && j >= n - i - 1 && j <= i)
					array[i][j] = 1;
			}
		}

		for (int[] i : array) {
			System.out.print("[ ");
			for (int j : i)
				System.out.print(j + " ");
			System.out.println("]");
		}
	}
}
