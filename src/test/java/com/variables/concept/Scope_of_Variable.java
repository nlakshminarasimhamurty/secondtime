package com.variables.concept;

public class Scope_of_Variable {
	
	static int number=10;
	int number2=20;

	public static void main(String[] args) {
		
		System.out.println(Scope_of_Variable.number); //10
		
		Scope_of_Variable.number=40; //10 >> 40
		
		System.out.println(Scope_of_Variable.number);

		
		Scope_of_Variable scp =  new Scope_of_Variable();
		System.out.println(scp.number2);
		
		Scope_of_Variable scp1 =  new Scope_of_Variable();
		scp1.number2=40;
		System.out.println(scp1.number2);
		
		System.out.println(Scope_of_Variable.number);

		
		
	}
	
	public static void name() {
		
		int number1;
		
		//System.out.println(number1);
		
	}
	
	public static void number() {
		//System.out.println(number1);
	}

}
