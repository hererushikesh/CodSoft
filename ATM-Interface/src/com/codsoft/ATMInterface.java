package com.codsoft;

import java.util.Scanner;

public class ATMInterface  {
    public static void main(String[] args) {

		ATMOperationImpl atm = new ATMOperationImpl();

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the CodSoft ATM Machine...\n");
        char c = 0;

        do {
            welcomeMsg();
            Scanner sc = new Scanner(System.in);
            int options = sc.nextInt();

            switch (options) {
                case 1: {
                    atm.withdraw();
                    break;
                }
                case 2: {
                    atm.deposit();
                    break;
                }
                case 3: {
                    atm.checkBalance();
                    break;
                }
                case 4: {
                    System.out.println("Press 'q' for existing !!");
                    c = input.next().charAt(0);
                    System.out.println("Thanks for visiting the CodSoft ATM Machine...");
                    break;
                }
                default:
                    System.out.println("wrong input , please choose correct options");
            }
        } while (c != 'q');
    }

	public static void welcomeMsg() {
		System.out.println();
		System.out.println("**********************************************");
		System.out.println("Press 1  --> to Withdraw Money..!");
		System.out.println("Press 2  --> to Deposit your money..!");
		System.out.println("Press 3  --> to Check your Current Balance..!");
		System.out.println("Press 4  --> to Cancel.");
		System.out.println("**********************************************");
		System.out.println();
	}
}
