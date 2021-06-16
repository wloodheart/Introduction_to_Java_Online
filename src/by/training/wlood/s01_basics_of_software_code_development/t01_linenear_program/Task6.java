package by.training.wlood.s01_basics_of_software_code_development.t01_linenear_program;

import java.util.Scanner;

/*
Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае.
 */

public class Task6 {
	public static void main(String[] args) {
		int x;
		int y;

		x = enterFromConsole("x >> ");
		y = enterFromConsole("y >> ");

		boolean value = y <= 4 && y > 0 && x >= -2 && x <= 2 || y < 0 && y >= -3 && x >= -4 && x <= 4;

		System.out.println(value);
	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int value;

		System.out.print(message);
		while (!scanner.hasNext()) {
			scanner.next();
			System.out.print(message);
		}
		value = scanner.nextInt();

		return value;
	}
}
