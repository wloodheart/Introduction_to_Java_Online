package by.training.wlood.s05_basics_of_oop.task5b.bean.sweetimpl;

import by.training.wlood.s05_basics_of_oop.task5b.bean.Sweet;

import java.util.Objects;

public class Cookie implements Sweet {
    private String name;

    public Cookie() {
    }

    public Cookie(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cookie cookie = (Cookie) o;
        return Objects.equals(name, cookie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cookies{" +
                "name='" + name + '\'' +
                '}';
    }
}
