package by.training.wlood.s02_algoritmization.t03_sorth;

import java.util.Random;

/*
Даны дроби p1/q1, p2/q2 , ... , pn/qn ( pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task8 {
	public static void main(String[] args) {
		Fraction[] fractions = new Fraction[20];

		fillIn(fractions);
		printArray(fractions);
		bringToACommonDenominator(fractions);
		printArray(fractions);
		sortFractionArray(fractions);
		printArray(fractions);
	}

	static void sortFractionArray(Fraction[] fractions) {
		for (int i = 1, temp; i < fractions.length;) {
			if (fractions[i - 1].numerator > fractions[i].numerator) {
				temp = fractions[i - 1].numerator;
				fractions[i - 1].numerator = fractions[i].numerator;
				fractions[i].numerator = temp;
				if (i - 1 > 0)
					i--;
			} else
				i++;
		}
	}

	static void bringToACommonDenominator(Fraction[] fractions) {
		int commonDenominator = searchCommonDenominator(fractions);

		for (Fraction fraction : fractions) {
			fraction.numerator *= (double) commonDenominator / fraction.denominator;
			fraction.denominator = commonDenominator;
		}
	}

	static int searchCommonDenominator(Fraction[] fractions) {
		boolean isCommon = false;
		int commonDenominator = 0;
		while (!isCommon) {
			isCommon = true;
			commonDenominator++;
			for (Fraction fraction : fractions)
				if (commonDenominator % fraction.denominator != 0) {
					isCommon = false;
					break;
				}
		}

		return commonDenominator;
	}

	static void fillIn(Fraction[] fractions) {
		Random random = new Random();

		for (int i = 0; i < fractions.length; i++)
			fractions[i] = new Fraction(random.nextInt(9) + 1, random.nextInt(9) + 1);
	}

	static void printArray(Fraction[] array) {
		System.out.print("[ ");
		for (Fraction i : array)
			System.out.print(i + " ");
		System.out.println("]");
	}

	static class Fraction {
		int numerator;
		int denominator;

		Fraction(int numerator, int denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
		}

		@Override
		public String toString() {
			return String.format("%d/%d", numerator, denominator);
		}
	}
}