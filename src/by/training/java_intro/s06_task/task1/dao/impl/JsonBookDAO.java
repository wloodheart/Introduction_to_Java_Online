package by.training.java_intro.s06_task.task1.dao.impl;

import by.training.java_intro.s06_task.task1.bean.Book;
import by.training.java_intro.s06_task.task1.dao.BookDAO;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JsonBookDAO implements BookDAO {
    private List<Book> bookList;

    public JsonBookDAO() {
        parse();
    }

    @Override
    public void addBook(Book book) throws DAOException {
        if (book == null) {
            throw new DAOException("Incorrect book");
        }
        try {
            bookList.add(book);
        } catch (Exception e) {
            throw new DAOException();
        }
    }

    @Override
    public void deleteById(long id) throws DAOException {
        if (id == 0) {
            throw new DAOException("Incorrect id");
        }
        try {
            bookList.removeIf(book -> book.getId() == id);
        } catch (Exception e) {
            throw new DAOException();
        }
    }

    @Override
    public void deleteByBook(Book book) throws DAOException {
        if (book == null) {
            throw new DAOException("Incorrect book");
        }
        try {
            bookList.remove(book);
        } catch (Exception e) {
            throw new DAOException();
        }
    }

    private void parse() {
        Gson gson = new Gson();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/by/training/java_intro/s06_task/task1/resources/books.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert fileReader != null;
        bookList = List.of(gson.fromJson(fileReader, Book[].class));
    }
}
