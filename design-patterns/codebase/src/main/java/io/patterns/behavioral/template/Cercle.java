package io.patterns.behavioral.template;

public class Cercle extends Shape {

    private Position center;
    private float radius;

    public Cercle(Display display, Position center, float radius) {
        super(display);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void drawMe(GUI gui) {
        gui.drawCircle(this.center, this.radius);
    }
}
