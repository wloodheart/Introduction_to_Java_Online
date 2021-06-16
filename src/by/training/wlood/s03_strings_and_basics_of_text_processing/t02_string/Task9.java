package by.training.wlood.s03_strings_and_basics_of_text_processing.t02_string;

/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
Учитывать только английские буквы.
 */
public class Task9 {
	public static void main(String[] args) {
		String str = "Aa1aaA bb2bbb ccc3CCC";

		System.out.println(quantityLowerCase(str));
		System.out.println(quantityUpperCase(str));
	}

	static int quantityLowerCase(String str) {
		int q = 0;

		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				q++;

		return q;
	}

	static int quantityUpperCase(String str) {
		int q = 0;

		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				q++;

		return q;
	}
}
