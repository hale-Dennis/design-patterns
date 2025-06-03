package com.dennis;

public class StripeAPI {
    public void chargeCard(String cardNumber, double amount) {
        System.out.println("Charging Card " + cardNumber + " to " + amount);
    }
}
