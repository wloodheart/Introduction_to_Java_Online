package by.training.wlood.s02_algoritmization.t01_onedimensional_array;

import java.util.Arrays;

/*
Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task10 {
	public static void main(String[] args) {
		int[] a = { 28, -25, 9, -40, -16, 20, -10, -40, 5, -43, -65, 73, 54, 43, 84, 51, 78, -19, -48, 73, -54, -33, 53,
				0, -78, 15, -84, 61, -79, 37, -46, 98, 59, 86, -90, -51, -34, 61, 94, -67 };

		System.out.println(Arrays.toString(a));

		for (int i = 0, j = 0; i < a.length / 2; i++, j += 2)
			a[i] = a[j];

		for (int i = a.length / 2; i < a.length; i++)
			a[i] = 0;

		System.out.println(Arrays.toString(a));
	}
}
