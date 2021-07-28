package by.training.java_intro.s01_basics_of_software_code_development.t02_branching;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Task3 {
	public static void main(String[] args) {
		// A B C
		double[] x = { -2, 1, 4 };
		double[] y = { 3, 1, -1 };

		double tgAB = (y[0] - y[1]) / (x[0] - x[1]);
		double tgAC = (y[0] - y[2]) / (x[0] - x[2]);

		if (tgAB == tgAC)
			System.out.println("Точки будут располоенны на одной прямой.");
		else
			System.out.println("Точки не будут расположены на одной прямой.");
	}
}
