package com.Day4_Problems;

import java.util.Scanner;

public class WindChill {
	public static void calculatewindchill() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the temperature in Farhenheit");
		double temp=sc.nextDouble();
		System.out.println("Enter the windspeed in miles per hours");
		double wind = sc.nextDouble();
		if (temp < 50 && wind > 3 && wind < 120) {
			double w = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(wind, 0.16);
			System.out.println("Windspeed : "+w);
		}
		else {
			System.out.println("Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger\r\n"
					+ "than 120 or less than 3");
		}
	}

	public static void main(String[] args) {
		calculatewindchill();
	}
}
