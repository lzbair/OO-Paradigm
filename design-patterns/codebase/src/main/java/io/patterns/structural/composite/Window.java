package io.patterns.structural.composite;

public abstract class Window {


    static final Window VACUUM = new Window("Can not zoom anymore") {
        @Override
        Window zoom(int i) {
            return this;
        }
    };

    private final String content;

    public Window(String content) {
        this.content = content;
    }

    abstract Window zoom(int scale);

    public void display() {
        System.out.println(content);
    }

    public static Window create(String content, int depth){
        if (depth <= 1) {
            return new NormalWindow(content);
        }
        String wrapped = "[ " + content + " ]";
        return new FractalWindow(content, create(wrapped, --depth));

    }
}
