package by.training.java_intro.s06_task.task1.dao.impl;

import by.training.java_intro.s06_task.task1.bean.Book;
import by.training.java_intro.s06_task.task1.dao.BookDAO;
import by.training.java_intro.s06_task.task1.dao.exeption.DAOException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImp implements BookDAO {
    private List<Book> bookList;
    private final String booksFilePath = "src/by/training/java_intro/s06_task/task1/resources/books";

    {
        read();
    }

    public BookDAOImp() {
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
            throw new DAOException(e);
        }
    }

    @Override
    public void deleteById(long id) throws DAOException {
        if (id < bookList.size()) {
            throw new DAOException("Incorrect id");
        }
        try {
            if (!bookList.removeIf(book -> book.getId() == id)) {
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
            if (!bookList.remove(book)) {
                throw new DAOException("The book has been not removed");
            }
            write();
        } catch (Exception e) {
            throw new DAOException(e);
        }
    }

    private void read() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

        try {
            fileInputStream = new FileInputStream(booksFilePath);
            objectInputStream = new ObjectInputStream(fileInputStream);
            bookList = (List<Book>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            File file = new File(booksFilePath);
            bookList = new ArrayList<>();
        } catch (EOFException e) {
            bookList = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void write() throws DAOException {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;

        try {
            fileOutputStream = new FileOutputStream(booksFilePath);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bookList);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new DAOException(e);
        }
    }
}
