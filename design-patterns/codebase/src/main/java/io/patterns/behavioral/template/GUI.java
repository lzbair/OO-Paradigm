package io.patterns.behavioral.template;

import java.util.Arrays;

public class GUI {

    private Display.Color color;

    public void setColor(Display.Color defaultColor) {
        this.color = defaultColor;
    }

    private void draw(Object... objs) {
        Arrays.stream(objs).forEach(System.out::println);
    }

    public void drawLine(Shape.Position start, Shape.Position end) {
        draw(this.color, start, end);
    }

    public void drawCircle(Shape.Position center, float radius) {
        draw(this.color, center, radius);
    }
}
