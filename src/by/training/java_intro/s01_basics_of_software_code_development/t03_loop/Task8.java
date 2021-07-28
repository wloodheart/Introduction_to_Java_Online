package by.training.java_intro.s01_basics_of_software_code_development.t03_loop;

import java.util.Random;

import static java.lang.Math.abs;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task8 {
	public static void main(String[] args) {
		int a;
		int b;
		Random random = new Random();

		a = abs(random.nextInt());
		b = abs(random.nextInt());

		System.out.print("Общие значения для " + a + " и " + b + " : ");
		for (int i = a; i > 0; i /= 10)
			for (int j = b; j > 0; j /= 10)
				if (i % 10 == j % 10)
					System.out.print(i % 10 + " ");
	}
}