package by.training.wlood.s05_basics_of_oop.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cave {
    private List<Treasure> treasureList;

    public Cave() {
        treasureList = new ArrayList<>();
    }

    public Cave(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    public List<Treasure> getTreasureList() {
        return treasureList;
    }

    public void setTreasureList(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    public void addTreasure(Treasure treasure){
        treasureList.add(treasure);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave cave = (Cave) o;
        return Objects.equals(treasureList, cave.treasureList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treasureList);
    }

    @Override
    public String toString() {
        return "Cave{" +
                "treasureList=" + treasureList +
                '}';
    }
}
