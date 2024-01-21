package com.codsoft;

import java.util.Scanner;

public class CurrencyConversionOperation {

	public void rupeeToDoller() {
		Double valueOfDoller;
		System.out.println("Convert Indian Rupee to Doller ::");
		Scanner sc = new Scanner(System.in);
		double nextDouble = sc.nextLong();
		valueOfDoller = nextDouble * 0.012;
		System.out.println("The Current Rate of the Doller is :: " + valueOfDoller + "$");
	}

	public void dollerToRupee() {
		Scanner sc = new Scanner(System.in);
		Double valueOfRupee;
		System.out.println("Convert Doller to Rupee : ");
		double nextDouble = sc.nextDouble();
		valueOfRupee = nextDouble * 83.06;
		System.out.println("Conversion of Doller to Indian Rupee :: " + valueOfRupee + "₹");
	}

	public void indianRupeeToRuble() {
		Scanner sc = new Scanner(System.in);
		double valuOfRuppe;
		System.out.println("Convert Indian Rupee to Rusian Ruble :: ");
		double nextDouble = sc.nextDouble();
		valuOfRuppe = nextDouble * 0.95;
		System.out.println("Conversion of Indian Rupee to Rusian Ruble :: " + valuOfRuppe + "₱");

	}

	public void indianRupeeToEuro() {
		Scanner sc = new Scanner(System.in);
		double valuOfRuppe;
		System.out.println("Convert Indian Rupee to Euro :: ");
		double nextDouble = sc.nextDouble();
		valuOfRuppe = nextDouble * 0.011;
		System.out.println("Conversion of Indian Rupee to Euro :: " + valuOfRuppe + "€");

	}

	public void indianRupeeToRial() {
		Scanner sc = new Scanner(System.in);
		double valuOfRuppe;
		System.out.println("Convert Indian Rupee to Iran Rial :: ");
		double nextDouble = sc.nextDouble();
		valuOfRuppe = nextDouble * 510.522;
		System.out.println("Conversion of Indian Rupee to Iran Rial :: " + valuOfRuppe + "IRR");

	}

	public void indianRupeeToDinar() {
		Scanner sc = new Scanner(System.in);
		double valuOfRuppe;
		System.out.println("Convert Indian Rupee to Iraq Dinar :: ");
		double nextDouble = sc.nextDouble();
		valuOfRuppe = nextDouble * 15.75;
		System.out.println("Conversion of Indian Rupee to Iraq Dinar :: " + valuOfRuppe + "ID");
	}
}
