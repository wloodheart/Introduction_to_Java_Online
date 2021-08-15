package by.training.java_intro.s06_task.task1.bean;

import java.util.Objects;

public class ElectronicBook implements Book{
    private final String title;
    private final String author;
    private final String releaseYear;
    private String description;


    public ElectronicBook() {
        title = null;
        author = null;
        releaseYear = null;
    }

    public ElectronicBook(String title, String author, String releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectronicBook that = (ElectronicBook) o;
        return Objects.equals(title, that.title) && Objects.equals(author, that.author) && Objects.equals(releaseYear, that.releaseYear) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, releaseYear, description);
    }

    @Override
    public String toString() {
        return "ElectronicBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
