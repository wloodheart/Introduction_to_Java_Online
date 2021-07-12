package by.training.wlood.s05_basics_of_oop.task5a.view;

import by.training.wlood.s05_basics_of_oop.task5a.controller.FlowerCompositionController;

import java.util.Objects;

public class View {
    private FlowerCompositionController flowerCompositionController;

    public View() {
    }

    public View(FlowerCompositionController flowerCompositionController) {
        this.flowerCompositionController = flowerCompositionController;
    }

    public FlowerCompositionController getFlowerCompositionController() {
        return flowerCompositionController;
    }

    public void setFlowerCompositionController(FlowerCompositionController flowerCompositionController) {
        this.flowerCompositionController = flowerCompositionController;
    }

    public void showFlowerComposition() {
        System.out.println(flowerCompositionController.getFlowerComposition().getFlowerList() + "\n"
                + flowerCompositionController.getFlowerComposition().getPackaging());
    }

    public void setPackagingTypeByPackagingName(String name) {
        if (flowerCompositionController.setPackagingTypeByPackagingName(name)) {
            System.out.println("Упаковка выбрана");
        } else {
            System.out.println("there is no such packaging");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        View view = (View) o;
        return Objects.equals(flowerCompositionController, view.flowerCompositionController);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerCompositionController);
    }

    @Override
    public String toString() {
        return "View{" +
                "flowerCompositionController=" + flowerCompositionController +
                '}';
    }
}
