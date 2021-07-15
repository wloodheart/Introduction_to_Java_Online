package by.training.wlood.s05_basics_of_oop.task5b.bean.sweetimpl;

import by.training.wlood.s05_basics_of_oop.task5b.bean.Sweet;

import java.util.Objects;

public class Cake implements Sweet {
    private String name;

    public Cake() {
    }

    public Cake(String name) {
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
        Cake cake = (Cake) o;
        return Objects.equals(name, cake.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                '}';
    }
}
