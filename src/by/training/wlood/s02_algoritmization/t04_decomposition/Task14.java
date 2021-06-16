package by.training.wlood.s02_algoritmization.t04_decomposition;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
 */
public class Task14 {
	public static void main(String[] args) {
		narcissisticNumberInRange(1000000);
	}

	static void narcissisticNumberInRange(int k) {
		for (int i = 0; i < k; i++)
			if (narcissisticNumber(i))
				System.out.println(i);
	}

	static boolean narcissisticNumber(int value) {
		int s = 0;
		int len = valueLength(value);

		for (int i = value; i > 0; i /= 10)
			s += Math.pow(i % 10, len);

		return s == value;
	}

	static int valueLength(int value) {
		int len = 0;

		for (int i = value; i > 0; i /= 10)
			len++;

		return len;
	}
}
