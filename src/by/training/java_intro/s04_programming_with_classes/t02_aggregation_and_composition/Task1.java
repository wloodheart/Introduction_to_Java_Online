package by.training.java_intro.s04_programming_with_classes.t02_aggregation_and_composition;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */
public class Task1 {

	public static void main(String[] args) {
		Text text = new Text();

		text.complementText("Hello from heading.");
		text.complementText("Hello from sentence 2...");

		System.out.println(text);
		text.displayHeading();
	}
}

class Text {
	private Sentence[] sentences = new Sentence[0];

	public void complementText(String inputString) {
		Sentence[] temp = new Sentence[sentences.length + 1];
		System.arraycopy(sentences, 0, temp, 0, sentences.length);
		sentences = temp;
		sentences[sentences.length - 1] = new Sentence(inputString);
	}

	public void displayHeading() {
		if (sentences[0] != null)
			System.out.println(sentences[0]);
		else
			System.out.println("Заголовка не существует.");
	}

	@Override
	public String toString() {
		String outputString = "";

		for (Sentence sentence : sentences)
			outputString += sentence;

		return outputString;
	}

}

class Sentence {
	private Word[] words;

	public Sentence(String inputString) {
		String[] strings = inputString.split(" ");
		words = new Word[strings.length];

		for (int i = 0; i < words.length; i++) {
			words[i] = new Word(strings[i]);
		}
	}

	@Override
	public String toString() {
		String outputString = "";

		for (Word word : words)
			outputString += " " + word;

		return outputString;
	}

}

class Word {
	private String word;

	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return word;
	}

}