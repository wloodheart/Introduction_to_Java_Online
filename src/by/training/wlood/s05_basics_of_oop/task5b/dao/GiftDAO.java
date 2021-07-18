package by.training.wlood.s05_basics_of_oop.task5b.dao;

import by.training.wlood.s05_basics_of_oop.task5b.bean.Gift;

import java.util.ArrayList;
import java.util.List;

public class GiftDAO {
    private static final GiftDAO instance =new GiftDAO();
    private final List<Gift> giftList = new ArrayList<>();

    private GiftDAO(){}

    public static GiftDAO getInstance() {
        return instance;
    }

    public List<Gift> getGiftList() {
        return giftList;
    }


}
