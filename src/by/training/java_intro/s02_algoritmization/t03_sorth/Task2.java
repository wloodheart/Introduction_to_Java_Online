package by.training.java_intro.s02_algoritmization.t03_sorth;

/*
Даны две последовательности. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Task2 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9, 10, 11, 12, 13, 14, 15 };
		int[] b = { 2, 4, 6, 8 };

		for (int i = 0, j = 0; i < a.length && j < b.length; i++)
			if (a[i] > b[j]) {
				System.arraycopy(a, i, a, i + 1, a.length - (i + 1)); // смещаем массив на 1 позицию в право.
				a[i] = b[j];
				j++;
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