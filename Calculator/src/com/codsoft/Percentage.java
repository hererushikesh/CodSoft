package com.codsoft;

public class Percentage {
	Subjects sub = new Subjects();
	public void calculateAvaragePercentile() {
		Double percentile = sub.getTotalMarks() / 700 * 100;
		sub.setGrades(percentile);
		System.out.println("The Average Percentage of the Student is :: " + sub.getGrades());
		System.out.println("**************************************************************");
	}
}
