package com.itc.login;

public class Car {

	
	 String carModel="abcd";
	 String carName="mahindra";
	 int carNumber= 1234;
	
	public static void main(String[] args) {
		
		int i=10;
		
		
		Car cr = new Car();
		System.out.println(cr);
		System.out.println(cr.carModel);
		System.out.println(cr.carName);
		cr.fastRun();
		
		
	}
	
	public void fastRun() {
		
		System.out.println("Its running");
		
	}

}
