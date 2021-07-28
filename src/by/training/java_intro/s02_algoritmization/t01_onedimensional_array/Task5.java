package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

/*
Даны целые числа а1, а2,..., аn. Вывести на печать только те числа, для которых а i > i.
 */

public class Task5 {
	public static void main(String[] args) {
		int[] a = { -92, 23, -29, 65, 78, -24, 82, 74, -30 };
		int i = 50;

		for (int j : a) {
			if (j > i)
				System.out.print(j + " ");
		}
	}
}
