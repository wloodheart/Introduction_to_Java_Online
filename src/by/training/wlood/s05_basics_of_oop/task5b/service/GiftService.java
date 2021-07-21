package by.training.wlood.s05_basics_of_oop.task5b.service;

import by.training.wlood.s05_basics_of_oop.task5b.bean.Gift;
import by.training.wlood.s05_basics_of_oop.task5b.dao.GiftDAO;

public class GiftService {
    private static final GiftService instance = new GiftService();

    public static GiftService getInstance() {
        return instance;
    }

    public void createGift() {
        GiftDAO.getInstance().getGiftList().add(new Gift());
    }
}
