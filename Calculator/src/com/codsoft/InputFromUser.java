package com.codsoft;

import java.util.Scanner;

public class InputFromUser {

	Subjects sub = new Subjects();
	Scanner sc = new Scanner(System.in);

	public void getMarks() {

		System.out.println("Welcome to the Student Grade Calculator..");
		System.out.printf(
				"=============  Welcome to the Student Grade Calculator..  ==============" + System.lineSeparator()); // marathi
		System.out.println("Enter obtained marks in marathi!");
		Double marksOfMarathi = sc.nextDouble();
		sub.setMarathi(marksOfMarathi);
		System.out.println("you Obtained marks in marathi is :: " + sub.getMarathi());
		// hindi
		System.out.println("Enter obtained marks in Hindi!");
		Double marksOfHindi = sc.nextDouble();
		sub.setHindi(marksOfHindi);
		System.out.println("you Obtained marks in Hindi is :: " + sub.getHindi());
		// english
		System.out.println("Enter obtained marks in English!");
		Double marksOfEnglish = sc.nextDouble();
		sub.setEnglish(marksOfEnglish);
		System.out.println("you Obtained marks in English is :: " + sub.getEnglish()); // mathematics
		System.out.println("Enter obtained marks in Mathematics!");
		Double marksOfMathematics = sc.nextDouble();
		sub.setMathematics(marksOfMathematics);
		System.out.println("you Obtained marks in mathematics is :: " + sub.getMathematics()); // history
		System.out.println("Enter obtained marks in History!");
		Double marksOfHistory = sc.nextDouble();
		sub.setHistory(marksOfHistory);
		System.out.println("you Obtained marks in History is :: " + sub.getHistory()); // science
		System.out.println("Enter obtained marks in Science!");
		Double marksOfScience = sc.nextDouble();
		sub.setScience(marksOfScience);
		System.out.println("you Obtained marks in Science is :: " + sub.getScience()); // social science
		System.out.println("Enter obtained marks in SocialScience!");
		Double marksOfSocialScience = sc.nextDouble();
		sub.setSocialScience(marksOfSocialScience);
		System.out.println("you Obtained marks in SocialScience is :: " + sub.getSocialScience());
		System.out.println("**************************************************************");
	}

	public void getTotalMarks() {
		 Double sumOfObtainedMarks = sub.getEnglish() + sub.getHindi() + sub.getHistory() + sub.getMarathi()
				+ sub.getMathematics() + sub.getScience() + sub.getSocialScience();
		 	sub.setTotalMarks(sumOfObtainedMarks);
		 	System.lineSeparator();
		System.out.println("You Got :: " + sub.getTotalMarks() + " OutOff :: 700");
		System.out.println("\n"+"**************************************************************");
	}

}
