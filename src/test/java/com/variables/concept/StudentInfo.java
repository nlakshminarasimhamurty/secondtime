package com.variables.concept;

public class StudentInfo {

	public String studentName, rollNumber;
	final static String className = "10th standard examination result";

	int kannada, english, hindi, social, science, maths;

	public int getKannada() {
		return kannada;
	}

	public void setKannada(int kannada) {
		this.kannada = kannada;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public StudentInfo(String studentName, String rollNumber) {

		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}

	public String resultandMarks(int english, int kannada, int hindi, int science, int maths, int social) {

		setKannada(kannada);
		setEnglish(english);
		setHindi(hindi);
		setScience(science);
		setSocial(social);
		setMaths(maths);

		int totalmarks = getEnglish() + getHindi() + getKannada() + getMaths() + getScience() + getSocial();

		String grade = null;

		if (totalmarks >= 300 && totalmarks < 450) {
			grade = "second class";
			return "Congrads your total marks " + totalmarks + " grade is " + grade;
		}

		else if (totalmarks >= 450 && totalmarks < 550) {
			grade = "first class";
			return "Congrads your total marks " + totalmarks + " grade is " + grade;
		}

		else if (totalmarks >= 550 && totalmarks <= 650) {
			grade = "destinction";
			return "Congrads your total marks " + totalmarks + " grade is " + grade;
		}

		else {
			System.out.println("invalid");
			return " ";
		}

	}

}
