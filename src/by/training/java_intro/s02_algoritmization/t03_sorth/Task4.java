package by.training.java_intro.s02_algoritmization.t03_sorth;

/*
Сортировка обменами. Дана последовательность чисел. Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1 . Если a i > a i + 1 , то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {
	public static void main(String[] args) {
		int[] a = { -91, 38, -78, -80, 41, -53, 9, 78, -64, -92, 27, -85, -25, -16, -72, -41, 24, 50, 40, 76, 70, 64,
				27, 5, 27, -80, 21, 24, 38, 7 };
		int q = 0;

		for (int i = 0; i < a.length; i++)
			for (int j = 0, temp; j < a.length - 1; j++)
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					q++;
				}

		printArray(a);
		System.out.println("Произведено " + q + " перестоновок.");
	}

	public static void printArray(int[] array) {
		System.out.print("[ ");
		for (int i : array)
			System.out.print(i + " ");
		System.out.println("]");
	}
}
