package by.training.java_intro.s05_basics_of_oop.task5b.bean;

import java.util.Objects;

public class Packaging {
    private String name;

    public Packaging() {
    }

    public Packaging(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packaging packaging = (Packaging) o;
        return Objects.equals(name, packaging.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Packaging{" +
                "name='" + name + '\'' +
                '}';
    }
}
