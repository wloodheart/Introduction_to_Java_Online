package by.training.java_intro.s02_algoritmization.t04_decomposition;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class Task16 {
	public static void main(String[] args) {
		int n = 16;

		long s = sum(n);
		System.out.println("Сумма " + s);
		System.out.println("Четных чисел " + numberOfEven(s));
	}

	static int numberOfEven(long value) {
		int q = 0;

		for (; value > 0; value /= 10)
			if ((value % 10) % 2 == 0)
				q++;

		return q;
	}

	static long sum(int n) {
		long s = startValue(n);

		while (s < Math.pow(10, n) - 2)
			s += s + 2;

		return s;
	}

	static int startValue(int n) {
		int value = 0;

		for (int i = 1; i <= n; i++)
			value += 1 * Math.pow(10, n - i);

		return value;
	}
}