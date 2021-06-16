package by.training.wlood.s02_algoritmization.t04_decomposition;

/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class Task15 {
	public static void main(String[] args) {
		int n = 5;

		calculate(n);
	}

	static void calculate(int n) {
		for (int i = 1; i <= 10 - n; i++)
			System.out.println(getValueByIndex(i, n));
	}

	static int getValueByIndex(int i, int n) {
		int value = 0;
		for (int j = 1; j <= n; j++, i++) {
			value += i * Math.pow(10, n - j);
		}
		return value;
	}
}
