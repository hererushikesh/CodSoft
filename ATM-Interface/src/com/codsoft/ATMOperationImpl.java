package com.codsoft;

import java.util.Scanner;

public class ATMOperationImpl {

    static double accBalance = 0;

    public void withdraw() {
        System.out.println("\n Enter withdrawal Amount :: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if (accBalance < amount) {
            System.out.println("Sorry..! The Amount has Exceeded.! Please try Again");
        } else {
            String message = "Successfully withdrawal Amount is :: " + amount + "\n";
            System.out.println(message);
            accBalance = accBalance - amount;
        }

    }

    public void deposit() {
        System.out.println("Enter Deposit Amount : ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Amount Cannot be less than zero");
        } else {
            System.out.println("Amount is credited in your Account :: " + amount);
            accBalance = accBalance + amount;
        }
    }

    public void checkBalance() {
        System.out.println("Your Current Bank Balance is :: " + accBalance + "Cr.");
    }
}
