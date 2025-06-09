package com.moadams;

public class CreditCardPayment implements PaymentStrategy{
    public void pay(double amount){
        System.out.println("Paid GHS " + amount + " using credit card");
    }
}
