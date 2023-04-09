package com.Day4_Problems;

import java.util.Scanner;

public class FlipCoin {
	public static void flipcoin() {
		Scanner sc = new Scanner (System.in);
		int toss = sc.nextInt();
		
		int heads=0 , tails=0 ;
		
		for (int i = 0; i < toss ; i++) {
		
		if (Math.random() < 0.5){
            System.out.println("Heads");
            heads=heads+1;
			}
		else{
            System.out.println("Tails");
            tails=tails+1;
			}
		}
		System.out.println("percentage of heads : " + (double)heads/toss*100 );
		System.out.println("percentage of tails:" + (double)tails/toss*100);
	}	
	
		
	public static void main(String[] args) {
		
		System.out.println("Enter the number of times you want to toss");
			flipcoin();		
	}
}

