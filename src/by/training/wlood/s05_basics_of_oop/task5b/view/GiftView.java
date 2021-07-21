package by.training.wlood.s05_basics_of_oop.task5b.view;

public class GiftView {
    private static final GiftView instance = new GiftView();

    private GiftView() { }

    public static GiftView getInstance() {
        return instance;
    }

    public void printMessage(String message){
        System.out.println(message);
    }

}
