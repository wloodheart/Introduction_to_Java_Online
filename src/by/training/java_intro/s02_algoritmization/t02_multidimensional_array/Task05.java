package by.training.java_intro.s02_algoritmization.t02_multidimensional_array;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

[ 1 1 1 1 1 1 1 1 ]
[ 2 2 2 2 2 2 2 0 ]
[ 3 3 3 3 3 3 0 0 ]
[ 4 4 4 4 4 0 0 0 ]
[ 5 5 5 5 0 0 0 0 ]
[ 6 6 6 0 0 0 0 0 ]
[ 7 7 0 0 0 0 0 0 ]
[ 8 0 0 0 0 0 0 0 ]

 */

public class Task05 {
	public static void main(String[] args) {
		int n = 10;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= n - i)
					array[i][j] = 0;
				else
					array[i][j] = i + 1;
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
