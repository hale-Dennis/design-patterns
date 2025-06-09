package com.moadams;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid GHS " + amount + " using paypal");
    }
}
