package com.dennis;

public class BankAdapter implements PaymentProcessor{
    BankAPI bankAPI;
    String accountNumber;

    public BankAdapter(String accountNumber, BankAPI bankAPI) {
        this.accountNumber = accountNumber;
        this.bankAPI = bankAPI;
    }

    @Override
    public void pay(double amount){
        bankAPI.makePayment(accountNumber, amount);
    }
}
