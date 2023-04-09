package com.Day4_Problems;

import java.util.Scanner;

public class VowelCon {
	public static void main(String[] args) {
		System.out.println("Enter the CHARACTER from the keyboard : ");
		Scanner sc = new Scanner (System.in);
		char alp = sc.next().charAt(0);
		
		if (alp == 'a' || alp == 'e' ||alp == 'i' ||alp == 'o' ||alp == 'u') {
			System.out.println("This is lower case vowel");
		}
		else if (alp == 'A' || alp == 'E' || alp == 'I' || alp == 'O' || alp == 'U') {
			System.out.println("This is upper case vowel");
		}
		else if (alp>='a' && alp <='z') {
			System.out.println("This is lower case consonant");
		}
		else if (alp>='A' && alp <='Z') {
			System.out.println("This is upper case consonant");
		}
		else if (alp >= 0 && alp <='9') {
			System.out.println("This is a number");
		}
		else {
			System.out.println("INVALID INPUT");
		}
	}
}
