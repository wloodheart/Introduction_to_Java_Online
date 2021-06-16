package by.training.wlood.s03_strings_and_basics_of_text_processing.t01_array;

/*
В строке найти количество чисел.
 */
public class Task4 {
	public static void main(String[] args) {
		String string = "1P:?FIaR]4123NS6>XLG?_96";

		System.out.println(amountOfNumbers(string));
	}

	static int amountOfNumbers(String inputString) {
		int q = 0;
		char[] chars = inputString.toCharArray();

		if (Character.isDigit(chars[0]))
			q = 1;
		for (int i = 1; i < chars.length; i++)
			if (Character.isDigit(chars[i]) && !Character.isDigit(chars[i - 1]))
				q++;

		return q;
	}
}
