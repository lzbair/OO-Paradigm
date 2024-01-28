package io.patterns.behavioral.command.toolbar;


import java.util.Scanner;

public class FindAction implements ItemAction {

    private final String text;

    public FindAction(String text) {
        this.text = text;
    }


    @Override
    public void run() {
        System.out.println("Enter a word");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String result = text.contains(word) ? "Found" : "Not  Found";
        System.out.println(word + ": " + result);

    }
}
