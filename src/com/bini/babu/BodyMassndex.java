package com.bini.babu;

public class BodyMassndex {

	public static void main(String[] args) {
		// bmi = weitght in kg / (height * height);
		double height = 6.2; // height in feet
		double weight = 85;
		double heightInMeters = height * 0.4536;
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("BMI: " + bmi);
	}
}
