package io.patterns.creational.abstractfactory.solution;

public class Monitor {
    private final ResponsiveKit responsiveKit;

    public Monitor(ResponsiveKit responsiveKit) {
        this.responsiveKit = responsiveKit;
    }

    public static void main(String... args) {
        final String viewMode = args[0];
        ResponsiveKit kit = "Mobile".equals(viewMode) ? ResponsiveKit.mobile() : ResponsiveKit.desktop();
        new Monitor(kit).display();
    }

    public void display() {

        // draw layout
        responsiveKit.layout();

        // display a image
        responsiveKit.image();

        // add
        responsiveKit.button();


        // display a 2nd image
        responsiveKit.image();


    }
}
