package com.Day4_Problems;

import java.util.Scanner;

public class HarmonicNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of values you want in the series");
		int num= sc.nextInt();
		double result = 0.0;	
		System.out.println("The harmonic series is ");
		for (int i = 1; i <= num; i++) {
			result = result + (double)1 / i;
            System.out.print(result + ", ");
		}
	}
}
