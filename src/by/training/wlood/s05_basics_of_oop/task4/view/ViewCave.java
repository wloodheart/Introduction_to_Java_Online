package by.training.wlood.s05_basics_of_oop.task4.view;

import by.training.wlood.s05_basics_of_oop.task4.bean.Cave;
import by.training.wlood.s05_basics_of_oop.task4.bean.Treasure;

import java.util.List;

public class ViewCave {
    private Cave cave;

    public ViewCave() {
    }

    public ViewCave(Cave cave) {
        this.cave = cave;
    }

    public Cave getCave() {
        return cave;
    }

    public void setCave(Cave cave) {
        this.cave = cave;
    }

    public void showTreasureList() {
        for (Treasure treasure : cave.getTreasureList()) {
            System.out.println(treasure.getName() + " : " + treasure.getPrice());
        }
    }

    public void showDearestTreasure() {
        System.out.println(cave.getDearestTreasure().getName() + " : " + cave.getDearestTreasure().getPrice());
    }

    public void showTreasureListByPrice(int inputPrice) {
        List<Treasure> treasureList = cave.getTreasureListByPrice(inputPrice);

        for (Treasure treasure : treasureList) {
            System.out.println(treasure.getName() + " : " + treasure.getPrice());
        }
    }
}
