package by.training.java_intro.s06_task.task1.controller.command.impl;

import by.training.java_intro.s06_task.task1.controller.command.Command;

public class WrongRequest implements Command {
    @Override
    public String execute(String request) {
        return null;
    }
}
