package com.moadams;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        String paymentMethod = "CreditCard";
        if(paymentMethod.equals("CreditCard")){
            context.setPaymentStrategy(new CreditCardPayment());
        }else if(paymentMethod.equals("PayPal")){
            context.setPaymentStrategy(new PayPalPayment());
        }
        context.makePayment(20.53);
    }
}