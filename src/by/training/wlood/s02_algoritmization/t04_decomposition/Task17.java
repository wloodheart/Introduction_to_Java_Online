package by.training.wlood.s02_algoritmization.t04_decomposition;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class Task17 {
	public static void main(String[] args) {
		int value = 58964;

		System.out.println("Ноль получится через " + subtraction(value) + " итераций.");
	}

	static int subtraction(int value) {
		int q = 0;

		while (value > 0) {
			value -= sum(value);
			q++;
		}

		return q;
	}

	static int sum(int value) {
		int s = 0;

		for (int i = value; i > 0; i /= 10)
			s += i % 10;

		return s;
	}
}
