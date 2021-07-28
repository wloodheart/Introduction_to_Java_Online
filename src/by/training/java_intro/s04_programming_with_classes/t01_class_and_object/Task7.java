package by.training.java_intro.s04_programming_with_classes.t01_class_and_object;

/*
7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.
 */
public class Task7 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(4, 5, 6);

		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimeter());
	}
}

class Triangle {
	private int sideA;
	private int sideB;
	private int sideC;

	public Triangle(int sideA, int sideB, int sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	public int getSideC() {
		return sideC;
	}

	public void setSideC(int sideC) {
		this.sideC = sideC;
	}

	public double getArea() {
		double p = 0.5 * (sideA + sideB + sideC);
		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

	public int getPerimeter() {
		return sideA + sideB + sideC;
	}
}