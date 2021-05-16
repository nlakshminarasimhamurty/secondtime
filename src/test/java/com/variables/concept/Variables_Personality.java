package com.variables.concept;

public class Variables_Personality {

	double height;
	double weight;

	String personName;

	Variables_Personality(String personName) {

		this.personName = personName;

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public static void main(String[] args) {

		Variables_Personality lokesh = new Variables_Personality("Lokesh");
		lokesh.setHeight(5.5);
		lokesh.setWeight(70);

		Variables_Personality naveen = new Variables_Personality("Naveen");
		naveen.setHeight(5.3);
		naveen.setWeight(70);

		System.out.println(lokesh.getWeight());
		System.out.println(lokesh.getHeight());
		
		System.out.println("-----------------");
		
		System.out.println(naveen.getWeight());
		System.out.println(naveen.getHeight());

	}

}
