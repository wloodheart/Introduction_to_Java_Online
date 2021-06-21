package by.training.wlood.s05_basics_of_oop.task4.bean;

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

    public void addTreasure(Treasure treasure) {
        treasureList.add(treasure);
    }

    public Treasure getDearestTreasure() {
        Treasure dearestTreasure = treasureList.get(0);

        for (Treasure treasure : treasureList) {
            if (dearestTreasure.getPrice() < treasure.getPrice())
                dearestTreasure = treasure;
        }
        return dearestTreasure;
    }

    public List<Treasure> getTreasureListByPrice(int inputPrice) {
        List<Treasure> outputTreasureList = new ArrayList<>();

        for (Treasure treasure : treasureList) {
            if (treasure.getPrice() == inputPrice)
                outputTreasureList.add(treasure);
        }
        return outputTreasureList;
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
