package com.variables.concept;

public class Methods_Variable_Concepts {

	public static void main(String[] args) {
		
		Methods_Variable_Concepts m1 = new Methods_Variable_Concepts();
		
		m1.myAge(17);
	}
	
	public int myAge(int age) {
		
		if(age>=18) {
			System.out.println("eligible for voting current age "+ age );
			
		}
		else {
			System.out.println("Not eligible for voting "+ age);
		}
		return age;
	}

}
