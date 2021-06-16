package by.training.wlood.s03_strings_and_basics_of_text_processing.t02_string;

/*
Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class Task5 {
	public static void main(String[] args) {
		String str = "aaaabbbbcccca";

		System.out.println("Количество символов а: " + quantityA(str));
	}

	static int quantityA(String str) {
		int q = 0;

		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == 'a')
				q++;

		return q;
	}
}
