package by.training.wlood.s05_basics_of_oop.task4.main;

import by.training.wlood.s05_basics_of_oop.task4.bean.Cave;
import by.training.wlood.s05_basics_of_oop.task4.bean.Treasure;
import by.training.wlood.s05_basics_of_oop.task4.view.UserInterface;
import by.training.wlood.s05_basics_of_oop.task4.view.ViewCave;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.
 */
public class Main {
    public static void main(String[] args) {
        ViewCave view = new ViewCave(new Cave(initTreasureList()));
        UserInterface userInterface = new UserInterface(view);

        userInterface.showMenu();
        userInterface.startOptionsByUserChoice();
    }

    static List<Treasure> initTreasureList() {
        List<Treasure> treasureList = new ArrayList<>(100);
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            StringBuilder name = new StringBuilder();
            name.append((char) (random.nextInt(25) + 65));
            for (int j = 0; j < random.nextInt(3) + 3; j++) {
                name.append((char) (random.nextInt(25) + 97));
            }
            treasureList.add(new Treasure(name.toString(), random.nextInt(100)));
        }

        return treasureList;
    }
}
