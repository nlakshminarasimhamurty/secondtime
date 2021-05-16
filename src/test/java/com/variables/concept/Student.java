package com.variables.concept;

public class Student {

	String name;
	long phnumber;

	Student(String name, long phnumber) {
		this.name = name;
		this.phnumber = phnumber;

	}

	String s1 = "Naveen";
	
	
	int i =10;
	

	public static void main(String[] args) {

		Student naveen = new Student("Naveen ", 9483600119l);
		Student lokesh = new Student("lokesh ", 9483600119l);
		Student sandeep = new Student("sandeep ", 9483600119l);

		System.out.println(naveen.name + naveen.phnumber);
		System.out.println(lokesh.name + lokesh.phnumber);
		System.out.println(sandeep.name + sandeep.phnumber);
		
		naveen=null;
		System.out.println(naveen);
		
		

	}

}
