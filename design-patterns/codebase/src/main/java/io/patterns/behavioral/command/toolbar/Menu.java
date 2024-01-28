package io.patterns.behavioral.command.toolbar;

import java.util.Collections;
import java.util.Map;

public class Menu {

    private final Map<String, MenuItem> items;

    public Menu(Map<String, MenuItem> items) {
        this.items = items;
    }


    public static Menu standardMenu() {
        return new Menu(Collections.singletonMap("F", new MenuItem("Press F --> To Find word", new FindAction("Hello world"))));
    }

    public void execute(String command) {
        this.items.get(command).execute();
    }

    public boolean supports(String command) {
        return this.items.containsKey(command);
    }

    public void display() {
        System.out.println("Select command: ");
        items.values().stream().map(MenuItem::description).forEach(System.out::println);
    }
}
