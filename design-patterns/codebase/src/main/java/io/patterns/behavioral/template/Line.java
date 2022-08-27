package io.patterns.behavioral.template;

public class Line extends Shape{

    private Position start;
    private Position end;

    public Line(Display display, Position start, Position end) {
        super(display);
        this.start = start;
        this.end = end;
    }

    @Override
    public void drawMe(GUI gui) {
        gui.drawLine(this.start, this.end);
    }
}
