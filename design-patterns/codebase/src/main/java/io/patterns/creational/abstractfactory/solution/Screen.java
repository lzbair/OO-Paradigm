package io.patterns.creational.abstractfactory.solution;

public class Screen {
    private final ResponsiveKit responsiveKit;

    public Screen(ResponsiveKit responsiveKit) {
        this.responsiveKit = responsiveKit;
    }

    public static void main(String... args) {
        final String viewMode = args[0];
        ResponsiveKit kit = "Mobile".equals(viewMode) ? ResponsiveKit.mobile() : ResponsiveKit.desktop();
        new Screen(kit).display();
    }

    public void display() {
        responsiveKit.layout();
        responsiveKit.image();
        responsiveKit.button();
    }
}
