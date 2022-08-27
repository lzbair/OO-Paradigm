package io.patterns.structural;

import java.util.List;

public class PaymentApplication {

    private final PaymentService paymentService;

    public PaymentApplication(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void pay(Price total){
        this.paymentService.doPay(total);
    }

    public static void run(PaymentProvider paymentProvider) {
        OnlinePaymentService paymentService = new OnlinePaymentService(paymentProvider);
        new PaymentApplication(paymentService).pay(new Price(100.00, "$"));
    }
}
