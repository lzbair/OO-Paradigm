package io.patterns.creational.abstractfactory.solution.families.mobile;

import io.patterns.creational.abstractfactory.Button;
import io.patterns.creational.abstractfactory.Layout;
import io.patterns.creational.abstractfactory.Image;
import io.patterns.creational.abstractfactory.solution.ResponsiveKit;

public class MobileView implements ResponsiveKit {


    @Override
    public Layout layout() {
        return new Screen();
    }

    @Override
    public Button button() {
        return new TouchButton();
    }

    @Override
    public Image image() {
        return new NarrowImage();
    }
}
