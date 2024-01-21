package com.codsoft;

import java.util.Scanner;

public class CurrencyConversion {

	static void welcomeMsg() {
		System.out.println("   Welcome to the Currency Converter Application..\n");
		System.out.println("   Press 1 --> to convert Indian Rupee to Ameraican Doller.");
		System.out.println("   Press 2 --> to convert Ameraican Doller to Indian Rupee.");
		System.out.println("   Press 3 --> to convert Indian Rupee to Russian Ruble.");
		System.out.println("   Press 4 --> to convert Indian Rupee to Euro.");
		System.out.println("   Press 5 --> to convert Indian Rupee to Iran Rial.");
		System.out.println("   Press 6 --> to convert Indian Rupee to Iraq Dinar.");
		System.out.println("   Press 7 --> to Exit.\n");
		System.out.println("   **********************************************************");
		System.out.println("Choose Anthing From Above..");
	}

	public static void main(String[] args) {

		CurrencyConversionOperation cco = new CurrencyConversionOperation();

		Scanner input = new Scanner(System.in);
		char c = 0;

		do {
			welcomeMsg();
			Scanner scan = new Scanner(System.in);
			int options = scan.nextInt();
			switch (options) {
			case 1: {
				cco.rupeeToDoller();
				break;
			}
			case 2: {
				cco.dollerToRupee();
				break;

			}
			case 3: {
				cco.indianRupeeToRuble();
				break;

			}
			case 4: {
				cco.indianRupeeToEuro();
				break;
			}
			case 5: {
				cco.indianRupeeToRial();
				break;
			}
			case 6: {
				cco.indianRupeeToDinar();
				break;
			}

			case 7: {
				System.out.println("Press 'q' for existing !!");
				c = input.next().charAt(0);
				System.out.println("Thanks for visiting the CodSoft Currency Converter Application...");
				break;
			}
			default:
				System.out.println("wrong input , please choose correct options");
			}

		} while (c != 'q');

	}

}
