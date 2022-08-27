package io.patterns.structural;

public class PaymentProvider {

    public boolean authorize(double value, String currency){
        // third party stuff
        return false;
    }

    public void capture(double value, String currency){
        // third party stuff
    }
}
