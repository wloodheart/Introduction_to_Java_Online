package by.training.java_intro.s06_task.task1.service.impl;

import by.training.java_intro.s06_task.task1.bean.Book;
import by.training.java_intro.s06_task.task1.dao.BookDAO;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;
import by.training.java_intro.s06_task.task1.dao.factory.DAOFactory;
import by.training.java_intro.s06_task.task1.service.BookService;
import by.training.java_intro.s06_task.task1.service.exeption.ServiceException;

public class BookServiceImpl implements BookService {
    @Override
    public void addNewBook(Book book) throws ServiceException {
        if (book == null) {
            throw new ServiceException("Incorrect book");
        }
        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            BookDAO bookDAO = daoFactory.getBookDAOImp();
            bookDAO.addBook(book);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void addEditedBook(Book book) throws ServiceException {
        if (book == null) {
            throw new ServiceException("Incorrect book");
        }
        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            BookDAO bookDAO = daoFactory.getBookDAOImp();
            bookDAO.deleteById(book.getId());
            bookDAO.addBook(book);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
