package by.training.java_intro.s02_algoritmization.t02_multidimensional_array;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
 */
public class Task04 {
	public static void main(String[] args) {
		int n = 10;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 != 0)
					array[i][j] = n - j;

				else
					array[i][j] = j + 1;
			}
		}

		for (int[] i : array) {
			System.out.print("[ ");
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("]");
		}
	}
}
