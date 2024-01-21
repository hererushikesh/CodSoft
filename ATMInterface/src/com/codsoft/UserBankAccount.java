package com.codsoft;

public class UserBankAccount {
	private static Double accBalance=0.0;
	private static Double depositAmount=0.0;
	private static Double withdrwalAmount=0.0;

	public static Double getDepositAmount() {
		return depositAmount;
	}

	public static void setDepositAmount(Double depositAmount) {
		UserBankAccount.depositAmount = depositAmount;
	}

	public static Double getWithdrwalAmount() {
		return withdrwalAmount;
	}

	public static void setWithdrwalAmount(Double withdrwalAmount) {
		UserBankAccount.withdrwalAmount = withdrwalAmount;
	}

	public Double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(Double accBalance) {
		this.accBalance = accBalance;
	}
}
