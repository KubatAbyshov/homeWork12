package com.company;

public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }


    public double deposite(double sum) {
        return amount;
    }

    public double withDraw(double sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException(
                    "Недостаточно средств", sum);
        }
        amount = amount - sum;
        return amount;
    }


}
