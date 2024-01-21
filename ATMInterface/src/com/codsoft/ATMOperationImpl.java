package com.codsoft;

import java.util.Scanner;

public class ATMOperationImpl {

	static UserBankAccount bankAccount = new UserBankAccount();
	Scanner scanner = new Scanner(System.in);
	static Double withdrwalAmount = UserBankAccount.getWithdrwalAmount();

	public String withdraw(Double amount) {
		bankAccount.setWithdrwalAmount(amount);
		if (withdrwalAmount >= bankAccount.getAccBalance()) {
			Double currentBalance = bankAccount.getAccBalance() - withdrwalAmount;
			bankAccount.setAccBalance(currentBalance);
			return "Sorry..! The Amount has Exceeded.! Please try Again";
		}
		return "Successfully withdrawal Amount is :: " + bankAccount.getWithdrwalAmount();
	}
	public String deposit(Double amount) {

		bankAccount.setDepositAmount(amount);
		Double depositAmount = bankAccount.getDepositAmount();
		bankAccount.setAccBalance(depositAmount);
		return "Amount is credited in your Account :: " + bankAccount.getDepositAmount();
	}

	public String checkBalance() {
		return "Your Current Bank Balance is :: " + (bankAccount.getAccBalance()-bankAccount.getWithdrwalAmount())+ "Cr.";
	}
}
