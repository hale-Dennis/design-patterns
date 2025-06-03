package com.dennis;

public class CheckoutService {
    PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount){
        paymentProcessor.pay(amount);
    }
}
