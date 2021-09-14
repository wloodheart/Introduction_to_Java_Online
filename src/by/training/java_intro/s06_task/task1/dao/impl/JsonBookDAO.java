package by.training.java_intro.s06_task.task1.dao.impl;

import by.training.java_intro.s06_task.task1.bean.Book;
import by.training.java_intro.s06_task.task1.bean.BookCatalog;
import by.training.java_intro.s06_task.task1.dao.BookDAO;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonBookDAO implements BookDAO {
    private BookCatalog catalog;

    {
        parse();
    }

    public JsonBookDAO() {
    }

    @Override
    public void addBook(Book book) throws DAOException {
        if (book == null) {
            throw new DAOException("Incorrect book");
        }
        try {
            book.setId(catalog.getBookList().size());
            catalog.getBookList().add(book);
            write();
        } catch (Exception e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void deleteById(long id) throws DAOException {
        if (id < catalog.getBookList().size()) {
            throw new DAOException("Incorrect id");
        }
        try {
            if (!catalog.getBookList().removeIf(book -> book.getId() == id)) {
                throw new DAOException("The book has been not removed");
            }
            write();
        } catch (Exception e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void deleteBook(Book book) throws DAOException {
        if (book == null) {
            throw new DAOException("Incorrect book");
        }
        try {
            if (!catalog.getBookList().remove(book)) {
                throw new DAOException("The book has been not removed");
            }
            write();
        } catch (Exception e) {
            throw new DAOException(e);
        }
    }

    private void parse() {
        Gson gson = null;
        FileReader fileReader = null;
        try {
            gson = new Gson();
            fileReader = new FileReader("src/by/training/java_intro/s06_task/task1/resources/books.json");
            catalog = gson.fromJson(fileReader, BookCatalog.class);
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
            printWriter = new PrintWriter("src/by/training/java_intro/s06_task/task1/resources/books.json");
            printWriter.write(gson.toJson(catalog));
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
