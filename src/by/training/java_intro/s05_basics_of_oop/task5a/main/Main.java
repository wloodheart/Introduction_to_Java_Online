package by.training.java_intro.s05_basics_of_oop.task5a.main;

import by.training.java_intro.s05_basics_of_oop.task5a.controller.FlowerCompositionController;
import by.training.java_intro.s05_basics_of_oop.task5a.view.View;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
•   Корректно спроектируйте и реализуйте предметную область задачи.
•   Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
•   Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
•   для проверки корректности переданных данных можно применить регулярные выражения.
•   Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
•   Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
и упаковка.
 */
public class Main {
    public static void main(String[] args) {

        FlowerCompositionController flowerCompositionController = new FlowerCompositionController();
        View view = new View(flowerCompositionController);

        flowerCompositionController.addFlowerByName("Rose", "Lily", "Tulip", "Orchid");
        view.setPackagingTypeByPackagingName("box");

        view.showFlowerComposition();

    }
}
