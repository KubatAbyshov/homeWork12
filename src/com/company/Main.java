package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposite(10000);

        for (int i = 0; i < bankAccount.getAmount(); i++) {
            {
                try {
                    bankAccount.withDraw(6000);

                } catch (LimitException le) {
                    System.out.println("Вы сняли - " + "6000");
                    break;
                }
                }

            }
        if (bankAccount.getAmount() < 6000) {
            System.out.println("Ваш счет =" + 0);
        }
        }


    }





