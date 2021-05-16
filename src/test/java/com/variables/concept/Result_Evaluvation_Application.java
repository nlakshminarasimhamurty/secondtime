package com.variables.concept;

public class Result_Evaluvation_Application {



	public static void main(String[] args) {
		
		StudentInfo lokesh = new StudentInfo("Lokesh", "12345");
		System.out.println(lokesh.resultandMarks(70, 80, 50, 70, 55, 90));
		
		System.out.println(lokesh.getSocial() + " Social Marks");
		
		StudentInfo sandeep = new StudentInfo("Lokesh", "12345");
		System.out.println(sandeep.resultandMarks(70, 80, 90, 70, 90, 90));
		
		StudentInfo mahesh = new StudentInfo("Lokesh", "12345");
		System.out.println(sandeep.resultandMarks(90, 90, 100, 100, 90, 90));
		
		
		StudentInfo naveen = new StudentInfo("Lokesh", "12345");
		System.out.println(sandeep.resultandMarks(90, 90, 1000, 100, 90, 90));
		
		
	
		

	}

}
