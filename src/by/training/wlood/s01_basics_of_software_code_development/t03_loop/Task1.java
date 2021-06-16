package by.training.wlood.s01_basics_of_software_code_development.t03_loop;

import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
 */

public class Task1 {
	public static void main(String[] args) {
		int x;
		long sum = 0;

		x = enterFromConsole("Введите целое положительное число >> ");
		while (x <= 0)
			x = enterFromConsole("Введите целое положительное число >> ");

		for (int i = 1; i < x; i++)
			sum += i;

		System.out.println(sum);
	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int value;

		System.out.print(message);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print(message);
		}
		value = scanner.nextInt();

		return value;
	}
}
