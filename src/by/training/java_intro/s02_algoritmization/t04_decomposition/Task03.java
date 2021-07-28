package by.training.java_intro.s02_algoritmization.t04_decomposition;

public class Task03 {
	public static void main(String[] args) {
		int a = 10;

		double kat = Math.sqrt(Math.pow(a, 2) - Math.pow((double) a / 2, 2));

		System.out.println(kat * a * 6);

		System.out.println((3 * Math.sqrt(3) * Math.pow(a, 2)) / 2);
	}
}