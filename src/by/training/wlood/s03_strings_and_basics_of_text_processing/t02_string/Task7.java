package by.training.wlood.s03_strings_and_basics_of_text_processing.t02_string;

/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */
public class Task7 {
	public static void main(String[] args) {
		String str = "abc cde def";

		str = deleteSpaces(str);
		str = deleteRepetition(str);
		System.out.println(str);
	}

	static String deleteRepetition(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);

		for (int i = 0; i < sb.length(); i++)
			for (int j = 0; j < i; j++)
				if (sb.charAt(i) == sb.charAt(j))
					sb.delete(j, j + 1);

		return sb.toString();
	}

	static String deleteSpaces(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);

		for (int i = 0; i < sb.length(); i++)
			if (sb.charAt(i) == ' ')
				sb.delete(i, i + 1);

		return sb.toString();
	}
}
