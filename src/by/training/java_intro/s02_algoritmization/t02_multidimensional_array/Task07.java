package by.training.java_intro.s02_algoritmization.t02_multidimensional_array;

import static java.lang.Math.pow;
import static java.lang.Math.sin;

/*
Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin((I^2 - J^2)/N)
 */
public class Task07 {
	public static void main(String[] args) {
		int n = 8;
		double[][] array = new double[n][n];
		double temp;
		int quantity = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				temp = sin((pow(i, 2) - pow(j, 2)) / n);
				array[i][j] = temp;
				if (temp < 0)
					quantity++;
			}

		for (double[] i : array) {
			System.out.print("[ ");
			for (double j : i)
				System.out.print(j + " ");
			System.out.println("]");
		}
		System.out.println("Положительных значений: " + quantity);
	}
}