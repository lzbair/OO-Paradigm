package io.patterns.structural.composite;

public class NormalWindow extends Window {


    public NormalWindow(String content) {
        super(content);
    }

    @Override
    Window zoom(int scale) {
        return Window.VACUUM;
    }
}
