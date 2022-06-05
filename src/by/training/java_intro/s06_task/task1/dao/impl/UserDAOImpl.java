package by.training.java_intro.s06_task.task1.dao.impl;

import by.training.java_intro.s06_task.task1.bean.User;
import by.training.java_intro.s06_task.task1.dao.UserDAO;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private List<User> userList;
    private final String usersFilePath = "src/by/training/java_intro/s06_task/task1/resources/users";

    public UserDAOImpl() {
        read();
    }

    @Override
    public void signIn(String login, String password) throws DAOException {
        if (login == null || login.isEmpty()) {
            throw new DAOException("Incorrect login");
        } else if (password == null || password.isEmpty()) {
            throw new DAOException("Incorrect password");
        }

        try {
            for (User user : userList) {
                if (user.getLogin().equals(login) && user.getPasswordHash() == password.hashCode()) {
                    user.setAuthorised(true);
                }
            }
        } catch (Exception e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void signUp(User user) throws DAOException {
        if (user == null) {
            throw new DAOException("Incorrect user");
        }
        for (User u : userList) {
            if (user.getLogin().equals(u.getLogin())) {
                throw new DAOException("this login already exists");
            }
        }
        try {
            user.setId(userList.size());
            userList.add(user);
            write();
        } catch (Exception e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void signOut(String login) throws DAOException {
        if (login == null || login.isEmpty()) {
            throw new DAOException("Incorrect login");
        }
        try {
            for (User user : userList) {
                if (user.getLogin().equals(login)) {
                    user.setAuthorised(false);
                }
            }
        } catch (Exception e) {
            throw new DAOException(e);
        }
    }

    private void read() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

        try {
            fileInputStream = new FileInputStream(usersFilePath);
            objectInputStream = new ObjectInputStream(fileInputStream);
            userList = (List<User>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            File file = new File(usersFilePath);
            userList = new ArrayList<>();
        } catch (EOFException e) {
            userList = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void write() throws DAOException {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;

        try {
            fileOutputStream = new FileOutputStream(usersFilePath);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(userList);
        } catch (IOException e) {
            throw new DAOException(e);
        }
    }
}
