package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

/*
Дана последовательность целых чисел a 1 , a 2 , ... , a n . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( a 1 , a 2 , ... , a n ) .
 */

public class Task8 {
	public static void main(String[] args) {
		int[] a = { -81, -81, -62, -59, 6, 24, 24, 52, 79, 95 };
		int[] b;
		int minValue;
		int quantityMin = 0;

		minValue = a[0];

		for (int i : a)
			if (i == minValue)
				quantityMin++;

		b = new int[a.length - quantityMin];

		if (b.length >= 0)
			System.arraycopy(a, quantityMin, b, 0, b.length);

		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
		for (int i : b) {
			System.out.print(i + " ");
		}
	}
}
