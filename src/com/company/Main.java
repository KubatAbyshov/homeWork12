package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposite(10000);

        while (true) {

                try {
                    System.out.println("Вы сняли 6000");
                    bankAccount.withDraw(6000);

                } catch (LimitException le) {
                    if (le.getRemainingAmount()< 6000){
                        System.out.println("Не достаточная сумма для снятия - " + bankAccount.getAmount());
                    }

                    break;
                }


        }
        if (bankAccount.getAmount() < 6000) {
            System.out.println("Ваш счет = " + 0);
        }
        }


    }





