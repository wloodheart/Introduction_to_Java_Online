package by.training.wlood.s02_algoritmization.t01_onedimensional_array;

import static java.lang.Math.max;

/*
Даны действительные числа a1, a2,..., an. Найти max(a1+an, a2+an-1....an+an-n).
 */

public class Task7 {
	public static void main(String[] args) {
		double[] a = { 0.762720308359075, 3.8651813788465272, 9.94180485900483, 2.410733807317696, 0.1331706615665631,
				-7.783081415492433, -0.5134213376925842, -9.605449555371141, -4.036711011334737, -1.8350344247006518 };
		double maxSum;
		
		maxSum = a[0] + a[a.length - 1];
		for (int i = 0; i < a.length; i++)
			maxSum = max(maxSum, a[i] + a[a.length - 1 - i]);

		System.out.println("maxSum: " + maxSum);
	}
}