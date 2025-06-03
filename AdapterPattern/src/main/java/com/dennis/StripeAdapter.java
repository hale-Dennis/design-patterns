package com.dennis;

public class StripeAdapter implements PaymentProcessor{
    StripeAPI stripe;
    String cardNumber;

    public StripeAdapter(String cardNumber, StripeAPI stripe) {
        this.cardNumber = cardNumber;
        this.stripe = stripe;
    }

    @Override
    public void pay(double amount){
        stripe.chargeCard(cardNumber, amount);
    }
}
