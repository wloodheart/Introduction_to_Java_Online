package by.training.wlood.s05_basics_of_oop.task4.view;

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

    public void startOptionsByUserChoice() {
        switch (enterFromConsole()) {
            case 0 -> System.out.println("Exit");
            case 1 -> {
                viewCave.showTreasureList();
                askReturnToMenu();
            }
            case 2 -> {
                viewCave.showDearestTreasure();
                askReturnToMenu();
            }
            case 3 -> {
                System.out.println("Enter price: ");
                viewCave.showTreasureListByPrice(enterFromConsole());
                askReturnToMenu();
            }
            default -> startOptionsByUserChoice();
        }

    }

    public void showMenu() {
        System.out.println("""
                                
                Select an option from menu:\s

                1. Show all treasures in cave;\s
                2. Show the dearest treasure;\s
                3. Show treasures by price.\s
                                
                0. Exit.""");
    }

    public void askReturnToMenu() {
        System.out.println("\nEnter 0 for return to menu");
        while (enterFromConsole() != 0) {
            enterFromConsole();
        }
        showMenu();
        startOptionsByUserChoice();
    }

    public int enterFromConsole() {
        System.out.print(">> ");

        while (!scanner.hasNextInt()) {
            System.out.print(">> ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
