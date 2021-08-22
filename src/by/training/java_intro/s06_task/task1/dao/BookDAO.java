package by.training.java_intro.s06_task.task1.dao;

import by.training.java_intro.s06_task.task1.bean.Book;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;

public interface BookDAO {
    void addBook(Book book) throws DAOException;

    void deleteById(long idBook) throws DAOException;

    void deleteBook(Book book) throws DAOException;
}
