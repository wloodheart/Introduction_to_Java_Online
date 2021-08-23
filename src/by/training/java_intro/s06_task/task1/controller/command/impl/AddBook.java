package by.training.java_intro.s06_task.task1.controller.command.impl;

import by.training.java_intro.s06_task.task1.bean.Book;
import by.training.java_intro.s06_task.task1.bean.BookType;
import by.training.java_intro.s06_task.task1.controller.command.Command;
import by.training.java_intro.s06_task.task1.service.BookService;
import by.training.java_intro.s06_task.task1.service.exeption.ServiceException;
import by.training.java_intro.s06_task.task1.service.factory.ServiceFactory;

import java.util.Locale;

public class AddBook implements Command {
    @Override
    public String execute(String request) {
        BookType bookType = null;
        String title = null;
        String author = null;
        String releaseYear = null;

        String response = null;

        String[] param = request.split(" ");

        try {
            bookType = BookType.valueOf(param[1].toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            return "Wrong book type";
        }

        title = param[2].replace('_', ' ');
        author = param[3].replace('_', ' ');
        releaseYear = param[4];

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        BookService bookService = serviceFactory.getBookService();

        Book book = new Book();
        book.setBookType(bookType);
        book.setTitle(title);
        book.setAuthor(author);
        book.setReleaseYear(releaseYear);

        System.out.println(book);

        try {
            bookService.addNewBook(book);
            response = "The book has been added.";
        } catch (ServiceException e) {
            response = "Error";
        }
        return response;
    }
}
