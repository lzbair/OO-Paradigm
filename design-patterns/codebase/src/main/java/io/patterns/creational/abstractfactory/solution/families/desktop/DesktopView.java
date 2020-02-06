package io.patterns.creational.abstractfactory.solution.families.desktop;

import io.patterns.creational.abstractfactory.solution.Button;
import io.patterns.creational.abstractfactory.solution.Layout;
import io.patterns.creational.abstractfactory.solution.Image;
import io.patterns.creational.abstractfactory.solution.ResponsiveKit;

class DesktopView implements ResponsiveKit {


    @Override
    public Layout layout() {
        return new Window();
    }

    @Override
    public Button button() {
        return new PushButton();
    }

    @Override
    public Image image() {
        return new WideImage();
    }
}
