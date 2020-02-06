package io.patterns.creational.abstractfactory.solution;


public interface ResponsiveKit {
    static ResponsiveKit desktop() {

    }

    static ResponsiveKit mobile() {

    }

    Layout layout();

    Button button();

    Image image();
}
