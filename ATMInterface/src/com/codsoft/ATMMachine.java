package com.codsoft;

public class ATMMachine {

	private String withdrawal = "Press 1  --> to Withdraw Money..!";
	private String deposit = "Press 2  --> to Deposit your money..!";
	private String checkBalance = "Press 3  --> to Check your Current Balance..!";
	private String cancel = "Press 4  --> to Cancel.";

	public String welcomeMsg() {
		ATMMachine atmMachine = new ATMMachine();
		System.out.println("Welcome to the CodSoft ATM Machine...\n");
		System.out.print(atmMachine.getWithdrawal() + "\n");
		System.out.print(atmMachine.getDeposit() + "\n");
		System.out.print(atmMachine.getCheckBalance() + "\n");
		System.out.println(atmMachine.getCancel());
		return "Thank you Visit Again ...";
	}

	public String getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(String withdrawal) {
		this.withdrawal = withdrawal;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getCheckBalance() {
		return checkBalance;
	}

	public void setCheckBalance(String checkBalance) {
		this.checkBalance = checkBalance;
	}

	public String getCancel() {
		return cancel;
	}

	public void setCancel(String cancel) {
		this.cancel = cancel;
	}
}
