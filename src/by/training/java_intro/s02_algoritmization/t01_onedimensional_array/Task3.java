package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */
public class Task3 {
	public static void main(String[] args) {
		double[] a = { -8.967656981665531, -5.973917622916214, -3.9317664106327506, -2.989437063022706,
				1.4191195264820848, 4.936363096778358, 5.214338693151529, 5.674443952917812, 8.14744909866398,
				8.66812238097588 };
		int zero = 0;
		int negative = 0;
		int positive = 0;

		for (double i : a) {
			if (i < 0)
				negative++;
			else if (i > 0)
				positive++;
			else
				zero++;
		}

		System.out.println("Отрицательных значений: " + negative + "\n" + "Положительных значений: " + positive + "\n"
				+ "Нулевых: " + zero);
	}
}
