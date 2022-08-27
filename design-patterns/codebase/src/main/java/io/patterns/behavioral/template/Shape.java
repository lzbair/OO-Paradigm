package io.patterns.behavioral.template;

public abstract class Shape {

    private final Display display;

    public Shape(Display display) {
        this.display = display;
    }

    public void paint(GUI gui) {
        gui.setColor(display.defaultColor());
        drawMe(gui);
    }

    public abstract void drawMe(GUI gui);



    class Position {
        int x;
        int y;
    }
}
