package by.training.wlood.s05_basics_of_oop.task4;

import java.util.List;

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

        while (true)
            userInterface.startOptionsByUserChoice();
    }

    static List<Treasure> initTreasureList(){
        return List.of(new Treasure("Iron", 105),
                new Treasure("Copper", 80),
                new Treasure("Gold", 120),
                new Treasure("Diamond", 150));
    }
}
