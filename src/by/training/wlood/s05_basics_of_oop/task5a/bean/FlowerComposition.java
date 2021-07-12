package by.training.wlood.s05_basics_of_oop.task5a.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlowerComposition {
    private List<Flower> flowerList;
    private Packaging packaging;

    public FlowerComposition() {
        flowerList = new ArrayList<>();
        packaging = new Packaging();
    }

    public FlowerComposition(List<Flower> flowerList, Packaging packaging) {
        this.flowerList = flowerList;
        this.packaging = packaging;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerComposition that = (FlowerComposition) o;
        return Objects.equals(flowerList, that.flowerList) && Objects.equals(packaging, that.packaging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerList, packaging);
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "flowerList=" + flowerList +
                ", packaging=" + packaging +
                '}';
    }
}
