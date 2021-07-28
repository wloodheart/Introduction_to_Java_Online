package by.training.java_intro.s03_strings_and_basics_of_text_processing.t02_string;

/*
В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task2 {
	public static void main(String[] args) {
		String str = "acacacacacccaaaacccaa";

		System.out.println(addB(str));
	}

	static String addB(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(str);

		for (int i = 0; i < stringBuilder.length(); i++)
			if (stringBuilder.charAt(i) == 'a')
				stringBuilder.insert(i + 1, 'b');

		return stringBuilder.toString();
	}
}
