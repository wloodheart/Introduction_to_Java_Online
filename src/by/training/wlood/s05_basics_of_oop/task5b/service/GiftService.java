package by.training.wlood.s05_basics_of_oop.task5b.service;

public class GiftService {
    private static final GiftService instance = new GiftService();

    public static GiftService getInstance() {
        return instance;
    }
}
