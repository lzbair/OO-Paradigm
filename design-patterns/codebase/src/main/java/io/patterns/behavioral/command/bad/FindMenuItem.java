package io.patterns.behavioral.command.bad;

import java.util.Scanner;

public class FindMenuItem implements MenuItem{


    @Override
    public void execute(Window document) {
        try (Scanner sc = new Scanner(System.in)) {
            document.find(sc.nextLine());
        }
    }

    @Override
    public void describe() {
        System.out.println("F ---> Find");
    }
}
