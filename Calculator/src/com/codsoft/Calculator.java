package com.codsoft;

public class Calculator {

	public static void main(String[] args) {

		InputFromUser user = new InputFromUser();
		user.getMarks();
		user.getTotalMarks();

		Percentage per = new Percentage();
		per.calculateAvaragePercentile();
		
		Grades grade= new Grades();
		grade.showGrades();
		System.out.println("\n"+"**************************************************************");
	}
}
