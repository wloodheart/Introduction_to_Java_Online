package by.training.java_intro.s02_algoritmization.t04_decomposition;

/*
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task07 {
	public static void main(String[] args) {
		System.out.println(sumInRange(1, 9));
	}

	static int sumInRange(int from, int to) {
		int sum = 0;

		for (int i = from; i <= to; i++)
			if (i % 2 != 0)
				sum += factorial(i);

		return sum;
	}

	static int factorial(int a) {
		int f = 1;

		for (int i = 1; i <= a; i++)
			f *= i;

		return f;
	}
}
