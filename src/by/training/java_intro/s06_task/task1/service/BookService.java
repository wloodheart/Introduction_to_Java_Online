package by.training.java_intro.s06_task.task1.service;

import by.training.java_intro.s06_task.task1.bean.Book;
import by.training.java_intro.s06_task.task1.dao.BookDAO;
import by.training.java_intro.s06_task.task1.service.exeption.ServiceException;

public interface BookService {
    void addNewBook(Book book) throws ServiceException;

    void addEditedBook(Book book) throws ServiceException;
}
