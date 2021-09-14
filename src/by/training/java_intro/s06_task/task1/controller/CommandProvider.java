package by.training.java_intro.s06_task.task1.controller;

import by.training.java_intro.s06_task.task1.controller.command.Command;
import by.training.java_intro.s06_task.task1.controller.command.CommandName;
import by.training.java_intro.s06_task.task1.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    public CommandProvider() {
        repository.put(CommandName.SIGN_IN, new SignIn());
        repository.put(CommandName.SIGN_UP, new SignUp());
        repository.put(CommandName.SIGN_OUT, new SignOut());
        repository.put(CommandName.ADD_BOOK, new AddBook());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    public Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
