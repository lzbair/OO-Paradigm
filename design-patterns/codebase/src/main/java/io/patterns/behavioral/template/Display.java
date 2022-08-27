package io.patterns.behavioral.template;

public class Display {

    public Color defaultColor() {
        return Color.GREEN;
    }

    enum Color {
        RED, GREEN;
    }

    enum Font {

    }

    enum Layout {
        // border, width, margin ... etc
    }
}
