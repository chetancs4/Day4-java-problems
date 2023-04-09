package com.Day4_Problems;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		quadraticequation();
		
	}

	private static void quadraticequation() {
		double a,b,c;
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter the value of a");
		a=sc.nextDouble();
		System.out.println("Enter  the value of b");
		b=sc.nextDouble();
		System.out.println("Enter the value of c");
		c=sc.nextDouble();
		//formula for determinant (make sure the determinant is positive for program to output)
		double delta = b*b - 4*a*c;
		System.out.println("determinant : "+delta);
		//formula for roots
		double firstroot = (-b + Math.sqrt(delta)) / (2 * a);
        double secondroot = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("Root 1 : "+ firstroot);
		System.out.println("Root 2 : "+ secondroot);
	}
}
