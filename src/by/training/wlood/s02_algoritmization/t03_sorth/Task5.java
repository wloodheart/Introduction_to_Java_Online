package by.training.wlood.s02_algoritmization.t03_sorth;

/*
Сортировка вставками. Дана последовательность чисел a 1 , a 2 , ... , a n . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a 1 , a 2 , ... , a i - упорядоченная последовательность, т. е.
a 1 <= a 2 <= ... <= a n . Берется следующее число a i + 1 и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task5 {
	public static void main(String[] args) {
		int[] a = { -91, -92, 38, -78, 41, -53, 9, 78, -64, -92, 27, -85, -25, -16, -72, -41, 24, 50, 40, 76, 70, 64,
				27 };

		for (int i = 1, temp, tempI; i < a.length; i++) {
			tempI = binarySearch(a, i);
			if (tempI < i) {
				temp = a[i];
				System.arraycopy(a, tempI, a, tempI + 1, i - tempI);
				a[tempI] = temp;
			}
		}

		printArray(a);
	}

	public static void printArray(int[] array) {
		System.out.print("[ ");
		for (int i : array)
			System.out.print(i + " ");
		System.out.println("]");
	}

	public static int binarySearch(int[] a, int max) {
		int min = 0;
		int key = a[max];

		while (min < max) {
			int mid = min + (max - min) / 2;

			if (key < a[mid])
				max = mid;
			else
				min = mid + 1;
		}

		return min;
	}
}