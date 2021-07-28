package by.training.java_intro.s03_strings_and_basics_of_text_processing.t03_regex;

/*
Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.
 */
public class Task1 {
	public static void main(String[] args) {
		String s = "Minsk (Belarusian: Мінск/Менск [mʲinsk], Russian: Минск) is the capital and the largest city of "
				+ "Belarus, located on the Svislač and the Niamiha rivers. As the capital, Minsk has a special "
				+ "administrative status in Belarus and is the administrative centre of Minsk Region (voblasć) and "
				+ "Minsk District (rajon). As of January 2018, its population was 1,982,444, (not including suburbs), "
				+ "making Minsk the 11th most populous city in Europe. Minsk is the administrative capital of the "
				+ "Commonwealth of Independent States (CIS) and seat of its Executive Secretary.\n" +

				"The earliest historical references to Minsk date to the 11 th century (1067), when it was noted as "
				+ "a provincial city within the Principality of Polotsk. The settlement developed on " + "the rivers.\n"
				+

				"From 1569, it was a capital of the Minsk Voivodeship, in the Polish–Lithuanian Commonwealth.It was "
				+ "part of a region annexed by the Russian Empire in 1793, as a consequence of the Second Partition "
				+ "of Poland.From 1919 to 1991, after the Russian Revolution, Minsk was the capital of the Belorussian "
				+ "Soviet Socialist Republic, in the Soviet Union.";

//        System.out.println(sortParagraphsByNumberOfSentences(s));
		System.out.println(sortWordsByLength(s));
//        System.out.println(sortLexemeByChar(s, 'a'));
	}

	static String sortParagraphsByNumberOfSentences(String s) {
		String[] paragraphs = s.split("\n");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < paragraphs.length; i++)
			for (int j = 0; j < paragraphs.length - 1; j++)
				if (numberOfSentencesInParagraph(paragraphs[j]) > numberOfSentencesInParagraph(paragraphs[j + 1]))
					swap(paragraphs, j);

		for (String paragraph : paragraphs)
			result.append(paragraph).append('\n');

		return result.toString();
	}

	static int numberOfSentencesInParagraph(String paragraph) {
		int q = 0;

		for (int i = 0; i < paragraph.length(); i++)
			if (paragraph.charAt(i) == '.' || paragraph.charAt(i) == '!' || paragraph.charAt(i) == '?')
				q++;

		return q;
	}

	static String sortWordsByLength(String str) {
		String[] sentences = str.split("[.!?\n]");
		StringBuilder result = new StringBuilder();

		for (String s : sentences)
			result.append(sortWordsInASentence(s));

		return result.toString();
	}

	static String sortWordsInASentence(String sentence) {
		String[] words = sentence.split("[ ,:()/\\[\\]]");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < words.length; i++)
			for (int j = 0; j < words.length - 1; j++)
				if (words[j].length() > words[j + 1].length())
					swap(words, j);

		for (String word : words)
			if (!word.isEmpty())
				sb.append(' ').append(word);
		sb.append(".\n");

		return sb.toString();
	}

	static String sortLexemeByChar(String str, char key) {
		String[] sentences = str.split("[.!?\n]");
		StringBuilder result = new StringBuilder();

		for (String sentence : sentences)
			result.append(sortLexemeByCharInASentence(sentence, key));

		return result.toString();
	}

	static String sortLexemeByCharInASentence(String sentence, char key) {
		String[] words = sentence.split("[ ,:()/\\[\\]]");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++)
			for (int j = 0; j < words.length - 1; j++) {
				if (numOfAGivenChar(words[j], key) < numOfAGivenChar(words[j + 1], key))
					swap(words, j);
				else if (numOfAGivenChar(words[j], key) == numOfAGivenChar(words[j + 1], key)
						&& alphabeticalComparison(words[j], words[j + 1]))
					swap(words, j);
			}

		for (String word : words)
			result.append(' ').append(word);
		result.append(".\n");

		return result.toString();
	}

	static int numOfAGivenChar(String word, char key) {
		int num = 0;

		for (char c : word.toCharArray())
			if (c == key)
				num++;

		return num;
	}

	static boolean alphabeticalComparison(String a, String b) {
		for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
			if (Character.toLowerCase(a.charAt(i)) > Character.toLowerCase(b.charAt(i)))
				return true;
			else if (Character.toLowerCase(a.charAt(i)) != Character.toLowerCase(b.charAt(i)))
				return false;
		}
		return false;
	}

	static String[] swap(String[] array, int index) {
		String temp = array[index];
		array[index] = array[index + 1];
		array[index + 1] = temp;

		return array;
	}
}