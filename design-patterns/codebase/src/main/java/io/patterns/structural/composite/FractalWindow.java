package io.patterns.structural.composite;

public class FractalWindow extends Window {

    private final Window nestedWindow;

    public FractalWindow(String content, Window nestedWindow) {
        super(content);
        this.nestedWindow = nestedWindow;
    }

    @Override
    public Window zoom(int scale) {
        if (scale <= 1) {
            return nestedWindow;
        }
        return nestedWindow.zoom(--scale);
    }
}
