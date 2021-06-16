package by.training.wlood.s01_basics_of_software_code_development.t02_branching;

import java.util.Scanner;

import static java.lang.Math.pow;

/*
Вычислить значение функции.
 */

public class Task5 {
	public static void main(String[] args) {
		double x, y;

		x = enterFromConsole("x >> ");

		if (x > 3)
			y = 1 / (pow(x, 3) + 6);
		else
			y = pow(x, 2) - 3 * x + 9;

		System.out.println(y);
	}

	public static double enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double value;

		System.out.print(message);
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.print(message);
		}
		value = scanner.nextDouble();

		return value;
	}
}
