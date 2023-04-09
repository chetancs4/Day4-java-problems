package com.Day4_Problems;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		distanceformula();
	}

	private static void distanceformula() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first integer x");
		int x = sc.nextInt();
		System.out.println("Enter the second interger y");
		int y = sc.nextInt();
		double dist = Math.sqrt(x*x + y*y);
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
		
	}
}
