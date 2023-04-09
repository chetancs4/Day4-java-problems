package com.Day4_Problems;

import java.util.Iterator;
import java.util.Scanner;

public class PowerOF2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the power of 2 u want to print until");
		int power = sc.nextInt();
		for (int i = 1; i <= power; i++) {
			System.out.println("2^"+i+"="+(int)Math.pow(2, i));
		}
	}
}
