package com.Day4_Problems;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Enter the number to check if its even or odd : ");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println("The number is a even number");
		}
		else {
			System.out.println("The number is odd number");
		}
	}
}	
