package by.training.wlood.s02_algoritmization.t01_onedimensional_array;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */
public class Task9 {
	public static void main(String[] args) {
		int[] a = { 7, 9, 9, 4, 8, 3, 2, 0, 1, 4, 4, 2, 9, 2, 1, 6, 1, 8, 3, 0, 8, 9, 0, 2, 7, 5, 2, 3, 0, 5, 2, 7, 0,
				5, 5, 1, 4, 8, 5, 4 };
		int tempCount;
		int count = Integer.MIN_VALUE;
		int mostPopular;

		mostPopular = a[0];

		for (int i : a) {
			tempCount = 0;
			for (int j : a)
				if (i == j)
					tempCount++;

			if (tempCount > count) {
				count = tempCount;
				mostPopular = i;
			}

			else if (tempCount == count)
				mostPopular = Math.min(mostPopular, i);
		}

		System.out.println(
				"Самое часто встречающееся минимальное число: " + mostPopular + ", встречается " + count + " раз.");
	}
}
