package by.training.wlood.s05_basics_of_oop.task4;

public class View {
    private Cave cave;

    public View() {
    }

    public View(Cave cave) {
        this.cave = cave;
    }

    public Cave getCave() {
        return cave;
    }

    public void setCave(Cave cave) {
        this.cave = cave;
    }

    public void showTreasureList(){
        for (Treasure treasure : cave.getTreasureList()){
            System.out.println(treasure.getName() + " : " + treasure.getPrice());
        }
    }
}
