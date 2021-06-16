package by.training.wlood.s01_basics_of_software_code_development.t01_linenear_program;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
	public static void main(String[] args) {
		double r = 123.456;

		System.out.println((r * 1000) % 1000 + (int) r / 1000.0);
	}
}
