package by.training.java_intro.s06_task.task1.service;

import by.training.java_intro.s06_task.task1.bean.User;
import by.training.java_intro.s06_task.task1.service.exeption.ServiceException;

public interface UserService {
    void signIn(String login, String password) throws ServiceException;

    void signUp(User user) throws ServiceException;

    void signOut(String login) throws ServiceException;
}
