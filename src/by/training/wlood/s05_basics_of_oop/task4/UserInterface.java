package by.training.wlood.s05_basics_of_oop.task4;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner = new Scanner(System.in);
    private ViewCave viewCave;

    public UserInterface() {
    }

    public UserInterface(ViewCave viewCave) {
        this.viewCave = viewCave;
    }

    public ViewCave getViewCave() {
        return viewCave;
    }

    public void setViewCave(ViewCave viewCave) {
        this.viewCave = viewCave;
    }

    public void startOptionsByUserChoice(){
        showMenu();
        switch (enterFromConsole()){
            case 1 : viewCave.showTreasureList();
            case 2 : viewCave.showDearestTreasure();
            case 3 : viewCave.showTreasureListByPrice(enterFromConsole());
        }
    }

    public void showMenu(){
        System.out.println("""
                Select an option from menu:\s

                1. Show all treasures in cave;\s
                2. Show the dearest treasure;\s
                3. Show treasures by price.\s""");
    }

    public int enterFromConsole(){
        System.out.print(">> ");

        while (!scanner.hasNextInt()){
            System.out.println(">> ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
