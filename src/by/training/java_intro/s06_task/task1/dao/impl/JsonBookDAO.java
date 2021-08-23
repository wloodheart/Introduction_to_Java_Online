package by.training.java_intro.s06_task.task1.dao.impl;

import by.training.java_intro.s06_task.task1.bean.Book;
import by.training.java_intro.s06_task.task1.dao.BookDAO;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonBookDAO implements BookDAO {
    private List<Book> bookList = null;

    public JsonBookDAO() {
        bookList = new ArrayList<>();
        parse();
    }

    @Override
    public void addBook(Book book) throws DAOException {
        if (book == null) {
            throw new DAOException("Incorrect book");
        }
        try {
            book.setId(bookList.size());
            bookList.add(book);
            write();
        } catch (Exception e) {
            throw new DAOException();
        }
    }

    @Override
    public void deleteById(long id) throws DAOException {
        if (id < bookList.size()) {
            throw new DAOException("Incorrect id");
        }
        if (!bookList.removeIf(book -> book.getId() == id)) {
            throw new DAOException("The book has been not removed");
        }
        write();
    }

    @Override
    public void deleteBook(Book book) throws DAOException {
        if (book == null) {
            throw new DAOException("Incorrect book");
        }
        if (!bookList.remove(book)) {
            throw new DAOException("The book has been not removed");
        }
        write();
    }

    private void parse() {
        Gson gson = null;
        FileReader fileReader = null;
        try {
            gson = new Gson();
            fileReader = new FileReader("src/by/training/java_intro/s06_task/task1/resources/books.json");
            bookList.addAll(List.of(gson.fromJson(fileReader, Book[].class)));
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
            printWriter.write(gson.toJson(bookList));
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
