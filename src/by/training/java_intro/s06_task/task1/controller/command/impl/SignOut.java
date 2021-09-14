package by.training.java_intro.s06_task.task1.controller.command.impl;

import by.training.java_intro.s06_task.task1.controller.command.Command;
import by.training.java_intro.s06_task.task1.service.UserService;
import by.training.java_intro.s06_task.task1.service.exeption.ServiceException;
import by.training.java_intro.s06_task.task1.service.factory.ServiceFactory;

public class SignOut implements Command {
    @Override
    public String execute(String request) {
        String login = null;

        String response = null;

        String[] param = request.split(" ");
        login = param[1];

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();
        try {
            userService.signOut(login);
            response = "Welcome";
        } catch (ServiceException e) {
            response = "Error during login procedure";
        }
        return response;
    }
}
