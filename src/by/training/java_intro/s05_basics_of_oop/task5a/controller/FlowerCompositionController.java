package by.training.java_intro.s05_basics_of_oop.task5a.controller;

import by.training.java_intro.s05_basics_of_oop.task5a.bean.Flower;
import by.training.java_intro.s05_basics_of_oop.task5a.bean.FlowerComposition;
import by.training.java_intro.s05_basics_of_oop.task5a.bean.PackagingType;

import java.util.Objects;

public class FlowerCompositionController {
    private FlowerComposition flowerComposition;

    public FlowerCompositionController() {
        flowerComposition = new FlowerComposition();
    }

    public FlowerCompositionController(FlowerComposition flowerComposition) {
        this.flowerComposition = flowerComposition;
    }

    public FlowerComposition getFlowerComposition() {
        return flowerComposition;
    }

    public void setFlowerComposition(FlowerComposition flowerComposition) {
        this.flowerComposition = flowerComposition;
    }

    public void addFlowerByName(String... flowersName) {

        for (String name : flowersName)
            flowerComposition.getFlowerList().add(new Flower(name));
    }

    public boolean setPackagingTypeByPackagingName(String name) {
        boolean isCorrected = true;
        switch (name) {
            case "box" -> flowerComposition.getPackaging().setPackageType(PackagingType.BOX);
            case "envelope" -> flowerComposition.getPackaging().setPackageType(PackagingType.ENVELOPE);
            case "basket" -> flowerComposition.getPackaging().setPackageType(PackagingType.BASKET);
            case "ceramics" -> flowerComposition.getPackaging().setPackageType(PackagingType.CERAMICS);
            default -> isCorrected = false;
        }
        return isCorrected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerCompositionController that = (FlowerCompositionController) o;
        return Objects.equals(flowerComposition, that.flowerComposition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerComposition);
    }

    @Override
    public String toString() {
        return "FlowerCompositionController{" +
                "flowerComposition=" + flowerComposition +
                '}';
    }
}
