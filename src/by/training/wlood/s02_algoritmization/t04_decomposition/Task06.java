package by.training.wlood.s02_algoritmization.t04_decomposition;

import java.util.Random;

import static java.lang.Math.abs;
import static java.lang.Math.min;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task06 {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(20) - 10;
		int b = random.nextInt(20) - 10;
		int c = random.nextInt(20) - 10;

		if (primeNumbers(a, b, c))
			System.out.println("Числа " + a + ", " + b + " и " + c + " являются взаимно простыми.");
		else
			System.out.println("Числа " + a + ", " + b + " и " + c + " не являются взаимно простыми.");
	}

	static boolean primeNumbers(int a, int b, int c) {
		int min = min(abs(a), min(abs(b), abs(c)));

		for (int i = 2; i <= min; i++)
			if (a % i == 0 && b % i == 0 || a % i == 0 && c % i == 0 || b % i == 0 && c % i == 0)
				return false;

		return true;
	}
}
