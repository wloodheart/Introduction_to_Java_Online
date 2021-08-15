package by.training.java_intro.s06_task.task1.controller.command.impl;

import by.training.java_intro.s06_task.task1.controller.command.Command;
import by.training.java_intro.s06_task.task1.service.UserService;
import by.training.java_intro.s06_task.task1.service.exeption.ServiceException;
import by.training.java_intro.s06_task.task1.service.factory.ServiceFactory;

public class SignIn implements Command {
    @Override
    public String execute(String request) {
        String login = null;
        String password = null;

        String response = null;

        // get parameters from request Б and initialize the variables

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();
        try {
            userService.signIn(login, password);
            response = "Welcome";
        } catch (ServiceException e) {
            response = "Error during login procedure";
        }
        return response;
    }
}
