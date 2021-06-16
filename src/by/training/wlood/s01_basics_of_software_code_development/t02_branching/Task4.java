package by.training.wlood.s01_basics_of_software_code_development.t02_branching;

/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
 */

public class Task4 {
	public static void main(String[] args) {
		int a = 60;
		int b = 110;

		int x = 100;
		int y = 50;
		int z = 200;

		boolean bool = (a > x && (b > y || b > z)) || (a > y && (b > z || b > x)) || (a > z && (b > x || b > y));

		if (bool)
			System.out.println("Кирпичь пройдет.");
		else
			System.out.println("Кирпичь не пройдет");
	}
}
