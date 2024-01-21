package com.codsoft;

public class Subjects {
	public Double marathi;
	public Double hindi;
	public Double english;
	public Double mathematics;
	public Double history;
	public Double science;
	public Double socialScience;

	public static  Double grades;

	public  Double getGrades() {
		return grades;
	}

	public  void setGrades(Double grades) {
		Subjects.grades = grades;
	}

	public static Double getTotalMarks() {
		return totalMarks;
	}

	public static void setTotalMarks(Double totalMarks) {
		Subjects.totalMarks = totalMarks;
	}

	public static Double totalMarks;

	public Subjects() {

	}

	public Subjects(Double marathi, Double hindi, Double english, Double mathematics, Double history, Double science,
			Double socialScience) {
		super();
		this.marathi = marathi;
		this.hindi = hindi;
		this.english = english;
		this.mathematics = mathematics;
		this.history = history;
		this.science = science;
		this.socialScience = socialScience;
	}

	public Double getMarathi() {
		return marathi;
	}

	public void setMarathi(Double marathi) {
		this.marathi = marathi;
	}

	public Double getHindi() {
		return hindi;
	}

	public void setHindi(Double hindi) {
		this.hindi = hindi;
	}

	public Double getEnglish() {
		return english;
	}

	public void setEnglish(Double english) {
		this.english = english;
	}

	public Double getMathematics() {
		return mathematics;
	}

	public void setMathematics(Double mathematics) {
		this.mathematics = mathematics;
	}

	public Double getHistory() {
		return history;
	}

	public void setHistory(Double history) {
		this.history = history;
	}

	public Double getScience() {
		return science;
	}

	public void setScience(Double science) {
		this.science = science;
	}

	public Double getSocialScience() {
		return socialScience;
	}

	public void setSocialScience(Double socialScience) {
		this.socialScience = socialScience;
	}
}
