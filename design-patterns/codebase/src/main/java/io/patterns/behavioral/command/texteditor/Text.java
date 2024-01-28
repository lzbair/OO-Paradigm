package io.patterns.behavioral.command.texteditor;

public class Text {
    private final String content;

    public Text(String content) {
        this.content = content;
    }

    public char first() {
        return this.charAt(0);
    }

    public Text deleteCharAt(int index) {
        return new Text(new StringBuilder(this.content).deleteCharAt(index).toString());
    }

    public char charAt(int index) {
        return this.content.charAt(index);
    }

    public Text insert(int index, char character) {
        return new Text(new StringBuilder(this.content).insert(index, character).toString());
    }
}
