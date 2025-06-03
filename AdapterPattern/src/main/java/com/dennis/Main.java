package com.dennis;

public class Main {
    public static void main(String[] args) {
        BankAPI bankAPI = new BankAPI();
        PaymentProcessor bankPayment = new BankAdapter("11234", bankAPI);

        StripeAPI stripeAPI = new StripeAPI();
        StripeAdapter stripeAdapter = new StripeAdapter("23434",  stripeAPI);


        checkout(stripeAdapter, 500);

    }
    public static void checkout(PaymentProcessor paymentProcessor, double amount) {
        CheckoutService checkoutService = new CheckoutService(paymentProcessor);
        checkoutService.checkout(amount);
    }
}