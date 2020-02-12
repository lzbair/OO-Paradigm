package io.patterns.creational.abstractfactory.problem;

import io.patterns.creational.abstractfactory.Button;
import io.patterns.creational.abstractfactory.Image;
import io.patterns.creational.abstractfactory.Layout;

public class Monitor {


    public static void main(String... args) {

        final boolean isMobileMode = "Mobile".equals(args[0]);

        // Need Layout
        Layout layout = null;

        if (isMobileMode) {
            layout = new Screen();
        } else {
            layout = new Window();
        }


        // Need a button
        Button button = null;

        if (isMobileMode) {
            button = new TouchButton();
        } else {
            button = new PushButton();
        }

        // Display  an image  here
        Image image = null;

        if (isMobileMode) {
            image = new NarrowImage();
        } else {
            image = new WideImage();
        }


        // Need an other button here
        Button button2 = null;

        if (isMobileMode) {
            button2 = new TouchButton();
        } else {
            button2 = new PushButton();
        }

    }

}
