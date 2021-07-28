package by.training.java_intro.s03_strings_and_basics_of_text_processing.t02_string;

/*
Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Task1 {
	public static void main(String[] args) {
		String str = "Дан    текст  (строка).   Найдите  наибольшее количество      подряд идущих пробелов в нем.";

		System.out.println(maxSpaces(str));
	}

	static int maxSpaces(String inputString) {
		int max = 0;

		for (int i = 0; i < inputString.length(); i++)
			if (inputString.charAt(i) == ' ')
				max = Math.max(max, quantitySpaces(inputString, i));

		return max;
	}

	static int quantitySpaces(String inputString, int i) {
		int q = 0;

		for (; inputString.charAt(i) == ' '; i++)
			q++;

		return q;
	}
}
