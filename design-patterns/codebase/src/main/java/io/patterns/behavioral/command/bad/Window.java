package io.patterns.behavioral.command.bad;

import java.util.Scanner;

public class Window {
    Menu menu = new Menu();

    public static void main(String[] args) {
        Clipboard.copy("Lahcen Zbair");
        Window document = new Window();
        document.menu();
        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                switch (sc.nextLine()) {
                    case "P":
                        document.paste();
                        break;
                    case "F":
                        document.find();
                        break;
                    default:
                        System.out.println("Invalid choice, Select again please ");
                }
            }
        }
    }

    void paste() {
        menu.doPaste();
    }

    void find() {
        menu.doFind(this);
    }

    void menu() {
        System.out.println("Select desired task to execute:");
        menu.options();
    }

    public void find(String word) {
        System.out.println("Found occurrences for: " + word);
    }
}
