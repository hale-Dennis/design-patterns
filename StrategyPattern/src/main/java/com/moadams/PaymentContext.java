package com.moadams;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amount){
        if(paymentStrategy == null){
            throw new IllegalStateException("Payment strategy is not implemented yet");
        }
        paymentStrategy.pay(amount);
    }
}
