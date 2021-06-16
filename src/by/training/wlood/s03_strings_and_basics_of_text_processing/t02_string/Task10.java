package by.training.wlood.s03_strings_and_basics_of_text_processing.t02_string;

/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
 */
public class Task10 {
	public static void main(String[] args) {
		String str = "Предложение 1. Предложение 2! Предложение 3?";

		System.out.println(quantity(str));
	}

	static int quantity(String s) {
		int q = 0;

		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?')
				q++;

		return q;
	}
}
