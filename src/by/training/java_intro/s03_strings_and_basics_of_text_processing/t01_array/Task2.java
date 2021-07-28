package by.training.java_intro.s03_strings_and_basics_of_text_processing.t01_array;

/*
Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task2 {
	public static void main(String[] args) {
		String s = "word на letter";

		wordToLetter(s);
	}

	static void wordToLetter(String s) {
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length - 3; i++)
			if (ch[i] == 'w' && ch[i + 1] == 'o' && ch[i + 2] == 'r' && ch[i + 3] == 'd')
				ch = replacement(ch, i);

		System.out.println(ch);
	}

	static char[] replacement(char[] c, int i) {
		String replacer = "letter";

		char[] result = new char[c.length + 2];
		System.arraycopy(c, 0, result, 0, i);
		System.arraycopy(replacer.toCharArray(), 0, result, i, replacer.length());
		System.arraycopy(c, i + 4, result, i + replacer.length(), c.length - i - 4);

		return result;
	}
}
