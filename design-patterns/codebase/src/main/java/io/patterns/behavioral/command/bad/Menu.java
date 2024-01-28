package io.patterns.behavioral.command.bad;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Menu {
    private final List<MenuItem> items;

    public Menu() {
        this.items = new ArrayList<>();
        this.items.add(new PasteMenuItem());
        this.items.add(new FindMenuItem());
    }

    public void options() {
        items.forEach(MenuItem::describe);
    }

    public void doPaste() {
        Optional<MenuItem> item = items.stream().filter(it -> it instanceof PasteMenuItem).findFirst();
        item.ifPresent(it -> it.execute(null));
    }

    public void doFind(Window document) {
        Optional<MenuItem> item = items.stream().filter(it -> it instanceof FindMenuItem).findFirst();
        item.ifPresent(it -> it.execute(document));
    }
}
