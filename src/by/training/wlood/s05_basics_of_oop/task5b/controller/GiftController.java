package by.training.wlood.s05_basics_of_oop.task5b.controller;

import by.training.wlood.s05_basics_of_oop.task5b.service.GiftService;
import by.training.wlood.s05_basics_of_oop.task5b.view.GiftView;

public class GiftController {
    private static final GiftController instance = new GiftController();

    private GiftController() {
    }

    public static GiftController getInstance() {
        return instance;
    }

    public void creteNewGift() {
        if (GiftService.getInstance().createNewGift())
            GiftView.getInstance().printMessage("new gifs created");
        else GiftView.getInstance().printMessage("new gifs not created");
    }
}
