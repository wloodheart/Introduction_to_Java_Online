package by.training.java_intro.s06_task.task1.bean;

import java.util.Objects;

public class Book {
    private final long id;
    private final BookType bookType;
    private final String title;
    private final String author;
    private final String releaseYear;
    private String description;


    public Book() {
        id = 0;
        bookType = null;
        title = null;
        author = null;
        releaseYear = null;
    }

    public Book(long id, BookType bookType, String title, String author, String releaseYear, String description) {
        this.id = id;
        this.bookType = bookType;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public BookType getBookType() {
        return bookType;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && bookType == book.bookType && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(releaseYear, book.releaseYear) && Objects.equals(description, book.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookType, title, author, releaseYear, description);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookType=" + bookType +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
