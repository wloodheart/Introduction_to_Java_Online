package by.training.wlood.s02_algoritmization.t01_onedimensional_array;

import java.util.Arrays;

/*
Даны действительные числа а1, а2,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class Task4 {
	public static void main(String[] args) {
		double[] a = { -8.967656981665531, -5.973917622916214, -3.9317664106327506, -2.989437063022706,
				1.4191195264820848, 4.936363096778358, 5.214338693151529, 5.674443952917812, 8.14744909866398,
				8.66812238097588 };
		double temp;
		int min = 0;
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[min])
				min = i;
			else if (a[i] > a[max])
				max = i;
		}

		temp = a[min];
		a[min] = a[max];
		a[max] = temp;

		System.out.println(Arrays.toString(a));
	}
}