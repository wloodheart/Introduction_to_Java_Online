package by.training.java_intro.s06_task.task1.main;

import by.training.java_intro.s06_task.task1.bean.Book;
import by.training.java_intro.s06_task.task1.bean.BookType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*
Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
Общие требования к заданию:

    Система учитывает книги как в электронном, так и в бумажном варианте.
    Существующие роли: пользователь, администратор.
    Пользователь может просматривать книги в каталоге книг, осуществлять поиск книг в каталоге.
    Администратор может модифицировать каталог.
    *При добавлении описания книги в каталог оповещение о ней рассылается на e-mail всем пользователям
    **При просмотре каталога желательно реализовать постраничный просмотр
    ***Пользователь может предложить добавить книгу в библиотеку, переслав её администратору на e-mail.
    Каталог книг хранится в текстовом файле.
    Данные аутентификации пользователей хранятся в текстовом файле. Пароль не хранится в открытом виде
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Book book = new Book(1, BookType.PAPER, "title", "author", "200", "");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(new Book());

        File file = new File("src/by/training/java_intro/s06_task/task1/resources/books.json");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.print(gson.toJson(bookList));

        printWriter.close();

    }
}