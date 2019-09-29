package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposite(10000);

        while (true) {
            try {
                bankAccount.withDraw(6000);
            }catch (LimitException e){
                System.out.println("Вы сняли - " + "6000");
                return;
                }
           finally {
                    System.out.println();
                }
            }
        }



    }




