package by.training.java_intro.s03_strings_and_basics_of_text_processing.t01_array;

/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */
public class Task5 {
	public static void main(String[] args) {
		String string = "  Удалить    в   строке   все   лишние   пробелы   ";

		System.out.println(deleteSpaces(string));
	}

	static char[] deleteSpaces(String inputString) {
		char[] chars = inputString.toCharArray();

		deleteStartSpaces(chars);
		deleteEndSpaces(chars);

		for (int i = 1; i < chars.length - 1; i++)
			if (chars[i] == ' ' && chars[i + 1] == ' ')
				chars[i] = 0;

		return chars;
	}

	static char[] deleteStartSpaces(char[] chars) {

		for (int i = 0; chars[i] == ' '; i++)
			chars[i] = 0;

		return chars;
	}

	static char[] deleteEndSpaces(char[] chars) {

		for (int i = chars.length - 1; chars[i] == ' '; i--)
			chars[i] = 0;

		return chars;
	}
}
