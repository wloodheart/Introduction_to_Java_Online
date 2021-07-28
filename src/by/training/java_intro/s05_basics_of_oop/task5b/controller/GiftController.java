package by.training.java_intro.s05_basics_of_oop.task5b.controller;

import by.training.java_intro.s05_basics_of_oop.task5b.bean.Sweet;
import by.training.java_intro.s05_basics_of_oop.task5b.bean.sweetimpl.Cake;
import by.training.java_intro.s05_basics_of_oop.task5b.bean.sweetimpl.Candy;
import by.training.java_intro.s05_basics_of_oop.task5b.bean.sweetimpl.Chocolate;
import by.training.java_intro.s05_basics_of_oop.task5b.bean.sweetimpl.Cookie;
import by.training.java_intro.s05_basics_of_oop.task5b.service.GiftService;
import by.training.java_intro.s05_basics_of_oop.task5b.view.GiftView;

import java.util.regex.Pattern;

public class GiftController {
    private static final GiftController instance = new GiftController();
    private final GiftService giftService = GiftService.getInstance();
    private final GiftView giftView = GiftView.getInstance();

    private GiftController() {
    }

    public static GiftController getInstance() {
        return instance;
    }

    public void creteNewGift() {
        giftService.createNewGift();
    }

    public void selectPackagingByGiftId(int id, String name) {
        if (Pattern.compile("[A-Za-z]+").matcher(name).find()) {
            giftService.setPackagingById(id, name);
        } else giftView.printPackagingIsInvalid();
    }

    public void addSweetByGiftId(int id, String sweetType, String sweetName){
        Sweet sweet = null;

        switch (sweetType){
            case "Cake" -> sweet = new Cake(sweetName);
            case "Candy" -> sweet = new Candy(sweetName);
            case "Chocolate" -> sweet = new Chocolate(sweetName);
            case "Cookie" -> sweet = new Cookie(sweetName);
            default -> giftView.printSweetIsInvalid(sweetType);
        }
        if (sweet != null) {
            giftService.addSweetByGiftId(id, sweet);
        }
    }
}
