package io.patterns.behavioral.command.bad;

import java.util.Stack;

public class Clipboard {

    private static final Stack<String> values = new Stack<>();

    public static String paste() {
        return values.pop();
    }

    public static String copy(String content) {
        return values.push(content);
    }
}
