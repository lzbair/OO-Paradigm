package io.patterns.creational.abstractfactory.solution.families.mobile;

import io.patterns.creational.abstractfactory.solution.Button;
import io.patterns.creational.abstractfactory.solution.Layout;
import io.patterns.creational.abstractfactory.solution.Image;
import io.patterns.creational.abstractfactory.solution.ResponsiveKit;

class MobileView implements ResponsiveKit {


    @Override
    public Layout layout() {
        return null;
    }

    @Override
    public Button button() {
        return null;
    }

    @Override
    public Image image() {
        return null;
    }
}
