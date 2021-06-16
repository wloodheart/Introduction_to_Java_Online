package by.training.wlood.s02_algoritmization.t04_decomposition;

import java.util.Arrays;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */
public class Task10 {
	public static void main(String[] args) {
		int[] array = fillIn(256);

		System.out.println(Arrays.toString(array));
	}

	static int[] fillIn(int n) {
		int[] array = new int[valueLength(n)];

		for (int i = array.length - 1; i >= 0; i--, n /= 10)
			array[i] = n % 10;

		return array;
	}

	static int valueLength(int value) {
		int len = 0;

		for (int i = Math.abs(value); i > 0; i /= 10)
			len++;

		return len;
	}
}