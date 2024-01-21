package com.codsoft;

public class Grades {

	Subjects sub = new Subjects();
			
	public void showGrades() {
		double grade = sub.getGrades();
		System.out.print("\n");
		if (grade == 100 || grade >= 90)
			System.out.println("Congratulations You are Pass with the Grade is :: A ");
		else if (grade == 80 || grade >= 89)
			System.out.println("Congratulations You are Pass with the Grade is :: B ");
		else if (grade == 79 || grade >= 70)
			System.out.println("Congratulations you are Pass with the Grade is :: C ");
		else if (grade == 69 || grade >= 60)
			System.out.println("Congratulations you are Pass with the Grade is :: D ");
		else
			System.out.println("Sorry you are Failed ...");
	}
}
