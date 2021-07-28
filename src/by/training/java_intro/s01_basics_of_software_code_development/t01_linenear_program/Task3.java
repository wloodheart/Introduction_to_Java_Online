package by.training.java_intro.s01_basics_of_software_code_development.t01_linenear_program;

import static java.lang.Math.*;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

public class Task3 {
	public static void main(String[] args) {
		double x = 1;
		double y = 1;
		double result;

		result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);

		System.out.println("Значение выражения равно: " + result);
	}
}