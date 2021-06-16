package by.training.wlood.s03_strings_and_basics_of_text_processing.t01_array;

/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Task1 {
	public static void main(String[] args) {
		String[] str = { "camelCase", "snakeCase" };

		for (String s : str)
			System.out.println(toSnakeCase(s));
	}

	static char[] toSnakeCase(String inputString) {
		char[] chars = inputString.toCharArray();

		for (int i = 0; i < chars.length; i++)
			if (Character.isUpperCase(chars[i]))
				chars = expand(chars, i);

		return chars;
	}

	static char[] expand(char[] a, int i) {
		char[] result = new char[a.length + 1];
		System.arraycopy(a, 0, result, 0, i);
		result[i] = '_';
		result[i + 1] = Character.toLowerCase(a[i]);
		System.arraycopy(a, i + 1, result, i + 2, a.length - i - 1);
		return result;
	}
}
