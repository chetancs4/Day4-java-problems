package com.Day4_Problems;

import java.util.Scanner;

public class sum_ques12 {
	public static void main(String[] args) {
		
		display();

	}

	private static void display() {
		
		Scanner sc = new Scanner(System.in);

		int arraysize;

		System.out.println("Enter the size of array : ");
		arraysize = sc.nextInt();

		int[] arr = new int[arraysize];
		System.out.println();
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arraysize; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;

		System.out.println();
		for (int i = 0; i < arraysize - 2; i++) {
			for (int j = i + 1; j < arraysize - 1; j++) {
				for (int k = j + 1; k < arraysize; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count = count + 1;
						System.out.println("The Triplet is : " + arr[i] + " " + arr[j] + " " + arr[k]);

					}
				}
			}
		}
		System.out.println();
		System.out.println("The count of triplet is : " + count);

	}

}
