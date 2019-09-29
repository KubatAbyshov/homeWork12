package com.company;

public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }



    public double deposite(double sum) {

        amount = amount+sum;
        System.out.println("Ваш счёт:" + amount);
        return amount;
    }

    public double withDraw(double sum) throws LimitException{
        if (amount < sum) {
               throw new LimitException("Не достаточная сумма для снятия - ", amount);

        }

        amount = amount - sum;
        System.out.println("Ваш счет после снятия " + amount);
        return amount;
    }


}
