package com.Day4_Problems;
import java.util.Scanner;

public class NumSWap {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number");
		int num_1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num_2 = sc.nextInt();
		System.out.println("The original numbers are :" + num_1 + " and " + num_2 );
		
		num_1 = num_1+num_2;
		num_2=num_1-num_2;
		num_1=num_1-num_2;
		System.out.println("The swapped numbers are : " + num_1 + " and " + num_2 );
		
	}
}
