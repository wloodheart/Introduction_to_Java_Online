package by.training.wlood.s05_basics_of_oop.task5b.bean.sweetimpl;

import by.training.wlood.s05_basics_of_oop.task5b.bean.Sweet;

import java.util.Objects;

public class Chocolate implements Sweet {
    private String name;

    public Chocolate() {
    }

    public Chocolate(String name) {
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
        Chocolate chocolate = (Chocolate) o;
        return Objects.equals(name, chocolate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                '}';
    }
}
