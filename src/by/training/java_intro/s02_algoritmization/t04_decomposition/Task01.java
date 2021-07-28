package by.training.java_intro.s02_algoritmization.t04_decomposition;

import java.util.Random;

/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: НОК(А,В) = А*В / НОД(А,В)
 */
public class Task01 {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int nod = searchNOD(a, b);

		System.out.println("a = " + a + "\nb = " + b + "\n" + nod);
		System.out.println(a * b / nod);
	}

	public static int searchNOD(int a, int b) {
		int nod = 1;
		for (int i = 1; i <= a && i <= b; i++)
			if (a % i == 0 && b % i == 0)
				nod = i;

		return nod;
	}
}
