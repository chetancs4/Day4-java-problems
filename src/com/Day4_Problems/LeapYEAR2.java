package com.Day4_Problems;

import java.util.Scanner;

public class LeapYEAR2 {
	public static void leapYear() {
		Scanner sc = new Scanner (System.in);
		int year = sc.nextInt();
		if (year<999) {
			System.out.println("error - Enter a 4 digit year");
		}
		else if (year > 9999) {
			System.out.println("error - Enter a 4 digit year");
		}
		else {
			if (year %100 == 0 && year % 100 == 0 && year% 4 == 0) {
				System.out.println("The year is a leap year");
			}
				else {System.out.println("The year is not a leap year");
					
				}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the 4 digit year : ");
		leapYear();
	}
		
}
