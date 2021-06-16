package by.training.wlood.s02_algoritmization.t04_decomposition;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task11 {
	public static void main(String[] args) {
		comparisonLength(100, 20);
	}

	static void comparisonLength(int a, int b) {
		int aLen = valueLength(a);
		int bLen = valueLength(b);

		if (aLen == bLen)
			System.out.println("Длинна чисел равна");
		else if (aLen > bLen)
			System.out.println("В числе " + a + " больше цифр.");
		else
			System.out.println("В числе " + b + " больше цифр.");
	}

	static int valueLength(int value) {
		int len = 0;

		for (int i = Math.abs(value); i > 0; i /= 10)
			len++;

		return len;
	}
}