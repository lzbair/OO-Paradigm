package io.patterns.behavioral.command.bad;

public class PasteMenuItem implements MenuItem {

    @Override
    public void execute(Window document) {
        System.out.println(Clipboard.paste());
    }

    @Override
    public void describe() {
        System.out.println("P ---> Paste");
    }
}
