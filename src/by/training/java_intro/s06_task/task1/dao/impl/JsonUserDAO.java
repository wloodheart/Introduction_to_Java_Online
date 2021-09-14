package by.training.java_intro.s06_task.task1.dao.impl;

import by.training.java_intro.s06_task.task1.bean.User;
import by.training.java_intro.s06_task.task1.dao.UserDAO;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class JsonUserDAO implements UserDAO {
    private final List<User> userList = new ArrayList<>();

    public JsonUserDAO() {
        parse();
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

    private void parse() {
        Gson gson = null;
        FileReader fileReader = null;
        try {
            gson = new Gson();
            fileReader = new FileReader("src/by/training/java_intro/s06_task/task1/resources/users.json");
            userList.addAll(List.of(gson.fromJson(fileReader, User[].class)));
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void write() {
        Gson gson = null;
        PrintWriter printWriter = null;
        try {
            gson = new GsonBuilder().setPrettyPrinting().create();
            printWriter = new PrintWriter("src/by/training/java_intro/s06_task/task1/resources/users.json");
            printWriter.write(gson.toJson(userList));
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
