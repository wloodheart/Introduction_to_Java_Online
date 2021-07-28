package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */
public class Task6 {
	public static void main(String[] args) {
		double[] a = { -4.475559565050964, 5.791547342630022, -9.040105774663566, 2.1962105663773954,
				-0.9122916402654297, 1.2158913614347462, 4.988992771958781, 8.71360758643058, -2.5622985909793172 };
		double sum = 0;

		for (int i = 3; i < a.length; i++)
			if (checkNaturalNum(i))
				sum += a[i];

		System.out.println("Сумма чисел с простым числом в индексе: " + sum);
	}

	public static boolean checkNaturalNum(int num) {
		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;

		return true;
	}
}
