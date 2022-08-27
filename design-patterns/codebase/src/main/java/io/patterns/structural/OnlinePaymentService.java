package io.patterns.structural;

public class OnlinePaymentService implements PaymentService {
    private final PaymentProvider paymentProvider;

    public OnlinePaymentService(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    @Override
    public void doPay(Price total) {
        if (paymentProvider.authorize(total.value, total.currency)) {
            paymentProvider.capture(total.value, total.currency);
        } else {
            throw new OnlinePaymentException("Total amount can not be authorized");
        }
    }

    private static class OnlinePaymentException extends RuntimeException {
        public OnlinePaymentException(String message) {
            super(message);
        }
    }
}
