package by.training.wlood.s02_algoritmization.t04_decomposition;

import java.util.Arrays;

/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
сумма цифр которых равна К и которые не большее N.
 */
public class Task12 {
	public static void main(String[] args) {
		int k = 8;
		int n = 100;

		int[] a = createArray(k, n);
		System.out.println(Arrays.toString(a));
	}

	static int[] createArray(int k, int n) {
		int[] a = new int[length(k, n)];

		for (int i = 0, j = k; i < a.length; j++)
			if (sum(j, k)) {
				a[i] = j;
				i++;
			}

		return a;
	}

	static int length(int k, int n) {
		int len = 0;

		for (int i = 0; i <= n; i++)
			if (sum(i, k))
				len++;

		return len;
	}

	static boolean sum(int value, int k) {
		int s = 0;

		for (int i = value; i > 0; i /= 10)
			s += i % 10;

		return s == k;
	}
}
