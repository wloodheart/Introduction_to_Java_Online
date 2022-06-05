package by.training.java_intro.s06_task.task1.service.impl;

import by.training.java_intro.s06_task.task1.bean.User;
import by.training.java_intro.s06_task.task1.dao.UserDAO;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;
import by.training.java_intro.s06_task.task1.dao.factory.DAOFactory;
import by.training.java_intro.s06_task.task1.service.UserService;
import by.training.java_intro.s06_task.task1.service.exeption.ServiceException;

public class UserServiceImpl implements UserService {
    @Override
    public void signIn(String login, String password) throws ServiceException {
        if (login == null || login.isEmpty()) {
            throw new ServiceException("Incorrect login");
        }
        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoFactory.getUserDAOImpl();
            userDAO.signIn(login, password);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void signUp(User user) throws ServiceException {
        if(user == null){
            throw new ServiceException("Incorrect user");
        }
        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoFactory.getUserDAOImpl();
            userDAO.signUp(user);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void signOut(String login) throws ServiceException {
        if(login == null || login.isEmpty()){
            throw new ServiceException("Incorrect login");
        }
        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoFactory.getUserDAOImpl();
            userDAO.signOut(login);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
