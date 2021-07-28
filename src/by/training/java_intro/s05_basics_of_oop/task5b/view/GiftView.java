package by.training.java_intro.s05_basics_of_oop.task5b.view;

import by.training.java_intro.s05_basics_of_oop.task5b.service.GiftService;

public class GiftView {
    private static final GiftView instance = new GiftView();

    private GiftView() {
    }

    public static GiftView getInstance() {
        return instance;
    }

    public void printGiftCreatedMessage() {
        System.out.println("Gift has been created");
    }

    public void printGiftNotCreatedMessage() {
        System.out.println("Gift has been not created");
    }

    public void printPackagingSelected() {
        System.out.println("packaging has been selected");
    }

    public void printPackagingIsInvalid() {
        System.out.println("packaging name is invalid");
    }

    public void showGiftById(int id) {
        System.out.println(GiftService.getInstance().getGiftById(id));
    }

    public void printSweetIsInvalid(String sweetType) {
        System.out.println("sweet " + sweetType + "not found");
    }

    public void printSweetHasBeenAdded() {
        System.out.println("sweet has been added");
    }
}
