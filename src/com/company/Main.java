package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposite(10000);

        try {
            bankAccount.withDraw(6000);
        }catch (LimitException le){
            for(int i = 0; i < le.getRemainingAmount(); i++);
            System.out.println("У вас не достаточно денег на счете " + bankAccount.getAmount());
            }



        }

    }

