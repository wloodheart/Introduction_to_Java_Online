package by.training.java_intro.s06_task.task1.dao.factory;

import by.training.java_intro.s06_task.task1.dao.BookDAO;
import by.training.java_intro.s06_task.task1.dao.UserDAO;
import by.training.java_intro.s06_task.task1.dao.impl.BookDAOImp;
import by.training.java_intro.s06_task.task1.dao.impl.UserDAOImpl;

public final class DAOFactory {
    public static final DAOFactory instance = new DAOFactory();

    private final BookDAO bookDAOImp = new BookDAOImp();
    private final UserDAO userDAOImpl = new UserDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public BookDAO getBookDAOImp() {
        return bookDAOImp;
    }

    public UserDAO getUserDAOImpl() {
        return userDAOImpl;
    }
}
