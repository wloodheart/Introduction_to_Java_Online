package by.training.java_intro.s02_algoritmization.t04_decomposition;

import java.util.Random;

/*
На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между
какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class Task04 {
	public static void main(String[] args) {
		Point[] points = new Point[10];

		fillIn(points);
		printArray(points);
		maxDistance(points);
	}

	static void maxDistance(Point[] points) {
		int a = -1;
		int b = -1;

		double max = 0;
		double tempDistance;

		for (int i = 0; i < points.length - 1; i++) {
			for (int j = i + 1; j < points.length; j++) {
				tempDistance = distance(points[i], points[j]);
				if (max < tempDistance) {
					max = tempDistance;
					a = i;
					b = j;
				}
			}
		}

		System.out.println("Найбольшее растояние между точками " + points[a] + " и " + points[b]);
	}

	static double distance(Point a, Point b) {
		return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
	}

	static void fillIn(Point[] points) {
		Random random = new Random();

		for (int i = 0; i < points.length; i++)
			points[i] = new Point(random.nextInt(200) - 100, random.nextInt(200) - 100);
	}

	static void printArray(Point[] points) {
		System.out.print("[ ");
		for (Point i : points)
			System.out.print(i + " ");
		System.out.println("]");
	}

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return String.format("(%d;%d)", x, y);
		}
	}
}
