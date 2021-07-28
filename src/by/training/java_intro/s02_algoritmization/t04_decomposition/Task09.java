package by.training.java_intro.s02_algoritmization.t04_decomposition;

import java.util.Random;

/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class Task09 {
	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(9) + 1;
		int y = random.nextInt(9) + 1;
		int z = random.nextInt(9) + 1;
		int t = random.nextInt(9) + 1;

		System.out.println("Площадь четырехугольника со сторонами " + x + ", " + y + ", " + z + ", " + t + ". равна "
				+ quadrangleArea(x, y, z, t));
	}

	static double quadrangleArea(int x, int y, int z, int t) {
		double p = (double) (x + y + z + t) / 2;

		return Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
	}
}