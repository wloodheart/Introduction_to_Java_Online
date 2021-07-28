package by.training.java_intro.s05_basics_of_oop.task5b.main;

import by.training.java_intro.s05_basics_of_oop.task5b.controller.GiftController;
import by.training.java_intro.s05_basics_of_oop.task5b.view.GiftView;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
подарок). Составляющими целого подарка являются сладости и упаковка.
 */
public class Main {
    public static void main(String[] args) {
        GiftController giftController = GiftController.getInstance();
        GiftView giftView = GiftView.getInstance();

        giftController.creteNewGift();
        giftController.selectPackagingByGiftId(0,"box");
        giftController.addSweetByGiftId(0, "Chocolate", "Alenka");
        giftController.addSweetByGiftId(0, "Cookie", "Slodych");

        giftView.showGiftById(0);

    }
}
