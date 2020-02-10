package io.patterns.creational.abstractfactory.solution;


import io.patterns.creational.abstractfactory.Button;
import io.patterns.creational.abstractfactory.Image;
import io.patterns.creational.abstractfactory.Layout;
import io.patterns.creational.abstractfactory.solution.families.desktop.DesktopView;
import io.patterns.creational.abstractfactory.solution.families.mobile.MobileView;

public interface ResponsiveKit {
    static ResponsiveKit desktop() {
        return new DesktopView();
    }

    static ResponsiveKit mobile() {
        return new MobileView();
    }

    Layout layout();

    Button button();

    Image image();
}
