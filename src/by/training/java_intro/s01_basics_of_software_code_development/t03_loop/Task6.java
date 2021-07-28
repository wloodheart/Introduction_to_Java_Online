package by.training.java_intro.s01_basics_of_software_code_development.t03_loop;

/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task6 {
	public static void main(String[] args) {
		char[] array = { 'a', 'b', 'c', 'd', 'e' };

		for (char temp : array) {
			System.out.println(temp + " -> " + (int) temp);
		}
	}
}
