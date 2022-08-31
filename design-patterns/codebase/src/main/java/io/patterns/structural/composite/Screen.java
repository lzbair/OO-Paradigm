package io.patterns.structural.composite;

public class Screen {

    public static void main(String[] args) {
        Window window = Window.create("Mandelbrot", 10);
        window.display();
        window.zoom(7).display();
        window.zoom(100).display();
    }
}
