package by.training.wlood.s03_strings_and_basics_of_text_processing.t02_string;

/*
С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class Task4 {
	public static void main(String[] args) {
		String key = "торт";
		String donor = "информатика";

		System.out.println(makeUp(key, donor));
	}

	static String makeUp(String key, String donor) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < key.length(); i++)
			for (int j = 0; j < donor.length(); j++)
				if (key.charAt(i) == donor.charAt(j))
					result.append(donor.charAt(j));

		if (!key.equals(result.toString()))
			return "Ошибка";

		return result.toString();
	}
}