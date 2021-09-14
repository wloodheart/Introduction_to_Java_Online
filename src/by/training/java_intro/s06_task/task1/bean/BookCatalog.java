package by.training.java_intro.s06_task.task1.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookCatalog {
    private final List<Book> bookList = new ArrayList<>();

    public BookCatalog() {
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookCatalog that = (BookCatalog) o;
        return Objects.equals(bookList, that.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookList);
    }

    @Override
    public String toString() {
        return "BookCatalog{" +
                "bookList=" + bookList +
                '}';
    }
}
