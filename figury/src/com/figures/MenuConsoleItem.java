package com.figures;

interface IMenuConsoleItemAction {
    void run();
}

public class MenuConsoleItem {
    String name;
    IMenuConsoleItemAction action;

    public MenuConsoleItem(String name, IMenuConsoleItemAction action) {
        this.name = name;
        this.action = action;
    }
}
