package by.training.wlood.s02_algoritmization.t02_multidimensional_array;

/*
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */
public class Task13 {
	public static void main(String[] args) {
		int temp;
		int[][] array = { { 75, -69, 80, 80, -70, 50, 50, 17, -20, 82, 51, 58, 89, 2, 28, -91, -98, -14, 38, -50 },
				{ 99, 24, 5, -40, -26, 37, 45, -29, -79, -73, 28, 24, -59, 15, 12, 77, -54, -5, 75, -21 },
				{ 92, 94, 96, 20, -53, -61, 19, 43, -65, -23, 34, 28, -66, 56, -76, 66, 76, 58, 76, 63 },
				{ 70, 68, 36, -74, 75, -5, -21, -52, -41, 12, 45, 93, 77, -84, 45, 27, 16, 6, 89, 1 },
				{ -2, 83, -54, 14, -78, -61, 47, -42, 76, 81, 45, 34, 63, 13, 61, -18, -81, 92, -30, 27 },
				{ -51, 10, 21, -21, -7, -49, -33, -30, 91, -10, 34, 85, 22, -70, 92, 74, -87, -12, 42, 63 },
				{ -94, 96, 53, 6, 47, -2, 99, 30, -1, -44, -76, -83, 2, 96, -73, 49, 86, 98, 1, 70 },
				{ -7, 96, -86, -7, -78, -36, 76, 12, 71, -32, 72, -54, -5, -30, -49, -78, 0, 82, -47, 64 },
				{ -26, 40, -98, -74, -40, -14, -33, 51, -41, 91, 80, -6, -83, 96, 76, -69, -56, -36, 85, -42 },
				{ 74, -21, -49, -53, -39, 67, 7, -89, 15, 70, 13, 73, -48, -44, -29, 43, -37, -74, 65, -36 } };

		for (int i = 0; i < array[0].length; i++)
			for (int j = 0; j < array.length - 1; j++)
				for (int k = 0; k < array.length - 1; k++)
					if (array[k][i] > array[k + 1][i]) {
						temp = array[k][i];
						array[k][i] = array[k + 1][i];
						array[k + 1][i] = temp;
					}

		printArray("Сортирован по возрастанию. ", array);

		for (int i = 0; i < array[0].length; i++)
			for (int j = 0; j < array.length - 1; j++)
				for (int k = 0; k < array.length - 1; k++)
					if (array[k][i] < array[k + 1][i]) {
						temp = array[k][i];
						array[k][i] = array[k + 1][i];
						array[k + 1][i] = temp;
					}

		printArray("Сортирован по убыванию. ", array);
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
