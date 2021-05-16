package com.variables.concept;

public class Variable_concept4 {

	static int number1 = 10;

	public static void main(String[] args) {

		int number1 = 40;
		// int number1=90;

		System.out.println(number1);

		System.out.println(Variable_concept4.number1);
		
		System.out.println(add(10,20));

	}

	
	public static int add(int number1, int number2) {
		return number1+number2;
	}
	
}
