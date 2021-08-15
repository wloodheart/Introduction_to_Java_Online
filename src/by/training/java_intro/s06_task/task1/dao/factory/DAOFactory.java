package by.training.java_intro.s06_task.task1.dao.factory;

import by.training.java_intro.s06_task.task1.dao.BookDAO;
import by.training.java_intro.s06_task.task1.dao.UserDAO;
import by.training.java_intro.s06_task.task1.dao.impl.JsonBookDAO;
import by.training.java_intro.s06_task.task1.dao.impl.JsonUserDAO;

public final class DAOFactory {
    public static final DAOFactory instance = new DAOFactory();

    private final BookDAO jsonBookDAOImpl = new JsonBookDAO();
    private final UserDAO jsonUserDAOImpl = new JsonUserDAO();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public BookDAO getJsonBookDAOImpl() {
        return jsonBookDAOImpl;
    }

    public UserDAO getJsonUserDAOImpl() {
        return jsonUserDAOImpl;
    }
}
