package by.training.java_intro.s03_strings_and_basics_of_text_processing.t01_array;

/*
В строке найти количество цифр.
 */
public class Task3 {
	public static void main(String[] args) {
		String string = "P:?FIaR]41NS6>XLG?_96";

		System.out.println("Цифр в строке: " + numberOfDigits(string));
	}

	static int numberOfDigits(String inputString) {
		int q = 0;
		char[] chars = inputString.toCharArray();

		for (char c : chars)
			if (Character.isDigit(c))
				q++;

		return q;
	}
}
