package by.training.java_intro.s06_task.task1.service.factory;

import by.training.java_intro.s06_task.task1.service.BookService;
import by.training.java_intro.s06_task.task1.service.UserService;
import by.training.java_intro.s06_task.task1.service.impl.BookServiceImpl;
import by.training.java_intro.s06_task.task1.service.impl.UserServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final BookService bookService = new BookServiceImpl();
    private final UserService userService = new UserServiceImpl();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public BookService getBookService() {
        return bookService;
    }

    public UserService getUserService() {
        return userService;
    }
}
