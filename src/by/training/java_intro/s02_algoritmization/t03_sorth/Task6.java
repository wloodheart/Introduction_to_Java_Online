package by.training.java_intro.s02_algoritmization.t03_sorth;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются
на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */
public class Task6 {
	public static void main(String[] args) {
		int[] a = { 75, -69, 80, 80, -70, 50, 50, 17, -20, 82, 51, 58, 89, 2, 28, -91, -98, -14, 38, -50 };

		for (int i = 1, temp; i < a.length;) {
			if (a[i - 1] > a[i]) {
				temp = a[i - 1];
				a[i - 1] = a[i];
				a[i] = temp;
				if (i - 1 > 0)
					i--;
			} else
				i++;
		}

		printArray(a);
	}

	public static void printArray(int[] array) {
		System.out.print("[ ");
		for (int i : array)
			System.out.print(i + " ");
		System.out.println("]");
	}
}