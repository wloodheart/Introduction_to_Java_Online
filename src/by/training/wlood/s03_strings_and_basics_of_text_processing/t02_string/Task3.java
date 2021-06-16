package by.training.wlood.s03_strings_and_basics_of_text_processing.t02_string;

/*
Проверить, является ли заданное слово палиндромом.
 */
public class Task3 {
	public static void main(String[] args) {
		String word = "tenet";

		if (isPalindrome(word))
			System.out.println("Слово " + word + " является палиндромом");
		else
			System.out.println("Слово " + word + " не является палиндромом");
	}

	static boolean isPalindrome(String word) {

		for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--)
			if (word.charAt(i) != word.charAt(j))
				return false;

		return true;
	}
}
