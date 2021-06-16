package by.training.wlood.s03_strings_and_basics_of_text_processing.t02_string;

/*
Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task6 {
	public static void main(String[] args) {
		String str = "Из заданной строки получить новую, повторив каждый символ дважды.";

		System.out.println(expand(str));
	}

	static String expand(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
