package by.training.java_intro.s06_task.task1.controller;

import by.training.java_intro.s06_task.task1.controller.command.Command;

public class Controller {
    private final CommandProvider commandProvider = new CommandProvider();

    private final char paramDelimiter = ' ';

    public String executeTask(String request){
        String commandName;
        Command executionCommand;

        commandName = request.substring(0, request.indexOf(paramDelimiter));
        executionCommand = commandProvider.getCommand(commandName);

        String response;
        response = executionCommand.execute(request);

        return response;
    }
}
