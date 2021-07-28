package by.training.java_intro.s02_algoritmization.t04_decomposition;

/*
Составить программу, которая в массиве A[N] находит второе по величине число(вывести на печать
число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Task05 {
	public static void main(String[] args) {
		int[] a = { -34, 11, 18, 83, -59, -17, -7, 20, -28, 51, -44, 35, 52, -44, 25, 4, 1, -73, 90, -35 };

		System.out.println("Вторым по величине значением является: " + littleMaxArrayValue(a));
	}

	static int maxArrayValue(int[] a) {
		int max = a[0];

		for (int i : a)
			if (max < i)
				max = i;

		return max;
	}

	static int littleMaxArrayValue(int[] a) {
		int littleMax = a[0];
		int max = maxArrayValue(a);

		for (int i : a)
			if (littleMax < i && littleMax != max)
				littleMax = i;

		return littleMax;
	}
}
