package com.variables.concept;

public class Exception_parameter_Variables {

	int number1;
	static  Exception_parameter_Variables ecp1 ;
	
	public static void main(String[] args) {
		
		ecp1 = new Exception_parameter_Variables();
		System.out.println(ecp1.number1);
		
		ecp1 = null;
		
		try{
			System.out.println(ecp1.number1);
		}
		catch(Exception e) {
			System.out.println("ecp is not pointing to any object");
		}


	}

}
