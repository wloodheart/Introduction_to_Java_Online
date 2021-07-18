package by.training.wlood.s05_basics_of_oop.task5b.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Gift {
    private List<Sweet> sweetList;
    private Packaging packaging;

    public Gift() {
        sweetList = new ArrayList<>();
        packaging = new Packaging();
    }

    public Gift(List<Sweet> sweetList, Packaging packaging) {
        this.sweetList = sweetList;
        this.packaging = packaging;
    }

    public List<Sweet> getSweetList() {
        return sweetList;
    }

    public void setSweetList(List<Sweet> sweetList) {
        this.sweetList = sweetList;
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
        Gift gift = (Gift) o;
        return Objects.equals(sweetList, gift.sweetList) && Objects.equals(packaging, gift.packaging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetList, packaging);
    }

    @Override
    public String toString() {
        return "Gift{" +
                "sweetList=" + sweetList +
                ", packaging=" + packaging +
                '}';
    }
}
