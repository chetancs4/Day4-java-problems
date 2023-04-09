package com.Day4_Problems;

import java.util.Scanner;

public class LeapYear {

	public static void leapyear() {
	
		Scanner sc = new Scanner (System.in);
		int yearTOcheck=sc.nextInt();
		if (yearTOcheck<999 && yearTOcheck>9999) {
			System.out.println("Enter a 4 digit number");			
		}
		else {
				if (yearTOcheck %100 == 0 && yearTOcheck % 100 == 0 && yearTOcheck% 4 == 0) {
				System.out.println("The year is a leap year");
			}
				else {System.out.println("The year is not a leap year");
					
				}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the year to check whether its a leap year or not ");
		leapyear();
		}
	}


