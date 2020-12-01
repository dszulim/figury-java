package com.figures;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MenuConsole {
    List<MenuConsoleItem> actions = new ArrayList<MenuConsoleItem>();

    public MenuConsole() {
        this.actions.add(new MenuConsoleItem("Zamknij program", () -> this.exit()));
    }

    public void addItem(MenuConsoleItem item) {
        this.actions.add(item);
    }

    public void run() {
        this.printActions();
        int n = (int)this.readInput();
        try {
            MenuConsoleItem item = this.actions.get(n);
            item.action.run();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wprowadź poprawny numer akcji");
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.run();
    }

    private void printActions() {
        System.out.println("Wybierz akcje:");
        for (int i = 0; i < this.actions.size(); i++) {
            MenuConsoleItem item = this.actions.get(i);
            System.out.println(i + " -> " + item.name);
        }
    }

    public static double readInput() {
        Scanner in = new Scanner(System.in);
        try {
            double a = in.nextInt();
            return a;
        } catch (InputMismatchException e) {
            System.out.println("Wprowadź prawidłową wartość");
            in.next();
            return MenuConsole.readInput();
        }
    }

    private void exit() {
        System.exit(0);
    }
}

