package com.Day4_Problems;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the divident");
		int divident = sc.nextInt();
		System.out.println("Enter the divisor");
		int divisor = sc.nextInt();
		 
		int quotient = divident / divisor ;
		int remainder = divident % divisor ;
		System.out.println("quotient : "+ quotient);
		System.out.println("remainder : " + remainder );
				
	}
}
