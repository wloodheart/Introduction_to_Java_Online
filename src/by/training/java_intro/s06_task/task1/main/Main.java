package by.training.java_intro.s06_task.task1.main;

import by.training.java_intro.s06_task.task1.bean.Book;
import by.training.java_intro.s06_task.task1.bean.BookType;
import by.training.java_intro.s06_task.task1.controller.CommandProvider;
import by.training.java_intro.s06_task.task1.controller.Controller;
import by.training.java_intro.s06_task.task1.dao.BookDAO;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;
import by.training.java_intro.s06_task.task1.dao.factory.DAOFactory;
import by.training.java_intro.s06_task.task1.dao.impl.JsonBookDAO;
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
        Controller controller = new Controller();
        controller.executeTask("ADD_BOOK PAPER Head_First Bert_Bates 2005");
    }
}
