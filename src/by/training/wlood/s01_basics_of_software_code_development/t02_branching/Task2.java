package by.training.wlood.s01_basics_of_software_code_development.t02_branching;

import static java.lang.Math.max;
import static java.lang.Math.min;

/*
Найти max{min(a, b), min(c, d)}.
 */

public class Task2 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		System.out.println(max(min(a, b), min(c, d)));
	}
}
