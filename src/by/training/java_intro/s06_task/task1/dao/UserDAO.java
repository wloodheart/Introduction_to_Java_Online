package by.training.java_intro.s06_task.task1.dao;

import by.training.java_intro.s06_task.task1.bean.User;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;

public interface UserDAO {
    void signIn(String login, String password) throws DAOException;

    void signUp(User user) throws DAOException;

    void signOut(String login) throws DAOException;
}
