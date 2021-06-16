package by.training.wlood.s02_algoritmization.t03_sorth;

/*
Сортировка выбором. Дана последовательность чисел. Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */
public class Task3 {
	public static void main(String[] args) {
		int[] a = { -91, 38, -78, -80, 41, -53, 9, 78, -64, -92, 27, -85, -25, -16, -72, -41, 24, 50, 40, 76, 70, 64,
				27, 5, 27, -80, 21, 24, 38, 7 };

		for (int i = 0, maxI = a.length - 1, temp; i < a.length; i++, maxI = a.length - 1) {
			for (int j = i; j < a.length; j++)
				if (a[maxI] < a[j])
					maxI = j;

			temp = a[i];
			a[i] = a[maxI];
			a[maxI] = temp;
		}

		printArray(a);
	}

	public static void printArray(int[] array) {
		System.out.print("[ ");
		for (int i : array)
			System.out.print(i + " ");
		System.out.println("]");
	}
}
