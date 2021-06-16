package by.training.wlood.s02_algoritmization.t04_decomposition;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.
 */
public class Task13 {
	public static void main(String[] args) {
		int n = 20;

		print(n);
	}

	static void print(int n) {
		for (int i = n; i < 2 * n; i++)
			System.out.println(i + " " + (i + 2));
	}
}
