package by.training.java_intro.s01_basics_of_software_code_development.t03_loop;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е.
 */

public class Task5 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		double e = 0.1;
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			double a = 1 / pow(2, i + 1) + 1 / pow(3, i + 1);
			if (abs(a) >= e)
				sum += a;
		}

		System.out.println(sum);
	}
}
