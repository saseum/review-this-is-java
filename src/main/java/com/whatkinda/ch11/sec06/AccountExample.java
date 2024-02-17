package com.whatkinda.ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(1000);
        acc.deposit(2000);
        acc.deposit(3000);

        System.out.println(acc.getBalance());

        try {
            acc.withdraw(7000);
        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }

    }
}
