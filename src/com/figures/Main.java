package com.figures;

public class Main {

    public static void main(String[] args) {
        MenuConsole menu = new MenuConsole();
        menu.addItem(new MenuConsoleItem("Oblicz pole i obwód prostokąta", () -> {
            System.out.println();
            System.out.println("Podaj długość boku a");
            double a = MenuConsole.readInput();
            System.out.println("Podaj długość boku b");
            double b = MenuConsole.readInput();
            Rectangle rect = new Rectangle(a, b);
            System.out.println(rect.toString());
            System.out.println("Pole = " + rect.area());
            System.out.println("Obwód = " + rect.circuit());
            System.out.println();
        }));
        menu.addItem(new MenuConsoleItem("Oblicz pole i obwód koła", () -> {
            System.out.println();
            System.out.println("Podaj długość promienia");
            double r = MenuConsole.readInput();
            Circle circle = new Circle(r);
            System.out.println(circle.toString());
            System.out.println("Pole = " + circle.area());
            System.out.println("Obwód = " + circle.circuit());
            System.out.println();
        }));
        menu.addItem(new MenuConsoleItem("Oblicz pole i obwód trójkąta", () -> {
            System.out.println();
            System.out.println("Podaj długość boku a");
            double a = MenuConsole.readInput();
            System.out.println("Podaj długość boku b");
            double b = MenuConsole.readInput();
            System.out.println("Podaj długość boku c");
            double c = MenuConsole.readInput();
            Triangle triangle = new Triangle(a, b, c);
            System.out.println(triangle.toString());
            System.out.println("Pole = " + triangle.area());
            System.out.println("Obwód = " + triangle.circuit());
            System.out.println();
        }));
        menu.run();
    }

}
