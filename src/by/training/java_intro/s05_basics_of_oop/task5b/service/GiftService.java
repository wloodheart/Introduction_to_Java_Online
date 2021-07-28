package by.training.java_intro.s05_basics_of_oop.task5b.service;

import by.training.java_intro.s05_basics_of_oop.task5b.bean.Gift;
import by.training.java_intro.s05_basics_of_oop.task5b.bean.Packaging;
import by.training.java_intro.s05_basics_of_oop.task5b.bean.Sweet;
import by.training.java_intro.s05_basics_of_oop.task5b.dao.GiftDAO;
import by.training.java_intro.s05_basics_of_oop.task5b.view.GiftView;

import java.util.ArrayList;

public class GiftService {
    private static final GiftService instance = new GiftService();
    private final GiftDAO giftDAO = GiftDAO.getInstance();
    private final GiftView giftView = GiftView.getInstance();

    private GiftService() {
    }

    public static GiftService getInstance() {
        return instance;
    }

    public void createNewGift() {
        giftDAO.getGiftList().add(new Gift(new ArrayList<>(), null));
        giftView.printGiftCreatedMessage();
    }

    public void setPackagingById(int id, String name) {
        giftDAO.getGiftList().get(id).setPackaging(new Packaging(name));
        giftView.printPackagingSelected();
    }

    public void addSweetByGiftId(int id, Sweet sweet) {
        giftDAO.getGiftList().get(id).getSweetList().add(sweet);
        giftView.printSweetHasBeenAdded();
    }

    public Gift getGiftById(int id) {
        if (id < giftDAO.getGiftList().size())
            return giftDAO.getGiftList().get(id);
        else return null;
    }
}
