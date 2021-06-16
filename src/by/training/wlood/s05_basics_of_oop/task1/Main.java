package by.training.wlood.s05_basics_of_oop.task1;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.
 */
public class Main {
	public static void main(String[] args) {
		File file = new File("text");
        TextFile textFile = new TextFile("text");

        System.out.println(file.hashCode());
        System.out.println(textFile.hashCode());
	}
}
