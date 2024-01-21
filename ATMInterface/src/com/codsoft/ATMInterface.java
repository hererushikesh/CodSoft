package com.codsoft;

import java.util.Scanner;

public class ATMInterface extends ATMOperationImpl {
	public static void main(String[] args) {
		ATMInterface atm = new ATMInterface();
		ATMMachine aTMMachine = new ATMMachine();

		aTMMachine.welcomeMsg();

		Scanner sc = new Scanner(System.in);
		int options = sc.nextInt();

		switch (options) {
		case 1: {
			System.out.println("Enter withdrawal Amount :: ");
			System.out.println(atm.withdraw(sc.nextDouble()));
			break;
		}
		case 2: {
			System.out.println("Enter Deposit Amount : ");
			System.out.println(atm.deposit(sc.nextDouble()));

			break;
		}
		case 3: {
			System.out.println(atm.checkBalance());

			break;
		}
		case 4: {
			System.out.println("Thanks for visiting the CodSoft ATM Machine...");

		}
		case 5:
			System.out.println("please try Again...!");

		}

		for (int i = 1; i < 4; i++) {
			int nextInt = sc.nextInt();
			if (nextInt == 1) {
				System.out.println("Enter withdrawal Amount :: ");
				System.out.println(atm.withdraw(sc.nextDouble()));

			} else if (nextInt == 2) {
				System.out.println("Enter Deposit Amount ::");
				System.out.println(atm.deposit(sc.nextDouble()));
			} else if (nextInt == 3) {
				System.out.println(atm.checkBalance());

			} else {
				System.out.println("Thanks for visiting the CodSoft ATM Machine..");
				System.out.println("please try Again...!");
			}
		}
		sc.close();
	}
}
