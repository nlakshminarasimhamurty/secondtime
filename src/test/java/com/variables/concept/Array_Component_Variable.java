package com.variables.concept;

public class Array_Component_Variable {

	public static void main(String args[]) {
		int number[] = new int[100];

		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		number[4] = 50;
		number[5] = 60;
		number[6] = 70;
		number[7] = 70;
		number[8] = 80;
		number[8] = 90;
		number[9] = 100;
		number[10] = 110;
		number[11] = 110;
		number[12] = 110;

		int count = 0;
		for (int i = 0; i <= number.length; i++) {
			count++;

			if (count == 10) {
				System.out.println("U reached maxiumum llimit");
				break;
			}

			System.out.println(number[i]);

		}

		System.out.println("For loop completed");
		System.out.println("count = " + count);

	}

	public static void add(int number1, int number2) {
		// TODO Auto-generated method stub

	}

}
