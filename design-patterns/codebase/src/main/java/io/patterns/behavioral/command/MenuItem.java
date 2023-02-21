package io.patterns.behavioral.command;

public class MenuItem {

    private final String label;
    private final ItemAction action;

    public MenuItem(String label, ItemAction action) {
        this.label = label;
        this.action = action;
    }

    public void execute() {
        System.out.println(label);
        action.run();
    }

    public String description() {
        return label;
    }
}
