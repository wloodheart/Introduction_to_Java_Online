package by.training.wlood.s05_basics_of_oop.task5b.controller;

public class GiftController {
    private static final GiftController instance = new GiftController();

    private GiftController() {
    }

    public static GiftController getInstance() {
        return instance;
    }
}
