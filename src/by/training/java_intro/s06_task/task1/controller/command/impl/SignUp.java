package by.training.java_intro.s06_task.task1.controller.command.impl;

import by.training.java_intro.s06_task.task1.bean.User;
import by.training.java_intro.s06_task.task1.controller.command.Command;
import by.training.java_intro.s06_task.task1.service.UserService;
import by.training.java_intro.s06_task.task1.service.exeption.ServiceException;
import by.training.java_intro.s06_task.task1.service.factory.ServiceFactory;

public class SignUp implements Command {
    @Override
    public String execute(String request) {
        User user = null;
        String login = null;
        String password = null;

        String response = null;

        String[] param = request.split(" ");
        login = param[1];
        password = param[2];

        user = new User();
        user.setLogin(login);
        user.setPasswordHash(password.hashCode());

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();
        try {
            userService.signUp(user);
            response = "Welcome";
        } catch (ServiceException e) {
            response = "Error during login procedure";
        }
        return response;
    }
}
