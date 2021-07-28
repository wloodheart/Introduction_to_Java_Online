package by.training.java_intro.s03_strings_and_basics_of_text_processing.t02_string;

/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */
public class Task8 {
	public static void main(String[] args) {
		String str = "aa aaa bbbb ccc dddddd fff";

		System.out.println(maxWord(str));
	}

	static String maxWord(String str) {
		String word = "";
		String[] strings = str.split(" ");

		for (String s : strings)
			if (s.length() > word.length())
				word = s;

		return word;
	}
}
