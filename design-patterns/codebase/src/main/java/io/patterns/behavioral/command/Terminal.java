package io.patterns.behavioral.command;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Menu menu = Menu.standardMenu();
        while (true) {
            menu.display();
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            if (menu.supports(command)) {
                menu.execute(command);
            } else {
                System.out.println("Invalid command, Select again please ");
            }

        }

    }
}
