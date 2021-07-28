package by.training.java_intro.s02_algoritmization.t04_decomposition;

import java.util.Random;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task02 {
	public static void main(String[] args) {
		int a, b, c, d;
		int gcd;
		Random random = new Random();

		do {
			a = random.nextInt(100) - 100;
			b = random.nextInt(100) - 100;
			c = random.nextInt(100) - 100;
			d = random.nextInt(100) - 100;

			gcd = greatestCommonDivisor(a, b, c, d);

			System.out.println(a + ", " + b + ", " + c + ", " + d);
			System.out.println(gcd);

		} while (gcd == 1);

		System.out.println(a + ", " + b + ", " + c + ", " + d);
		System.out.println(gcd);
	}

	static int greatestCommonDivisor(int a, int b, int c, int d) {
		int minValue = Math.min(Math.min(a, b), Math.min(c, d));
		int nod = 1;

		for (int i = 1; i < minValue; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0)
				nod = i;
		}
		return nod;
	}
}