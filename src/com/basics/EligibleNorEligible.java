package com.basics;

import java.util.Scanner;

public class EligibleNorEligible {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = sc.nextInt();
		if(num<18) {
			System.out.println("You are minor");
		}
		else if(num>18 && num<=65) {
			System.out.println("You are an Adult");
		}
		else if(num>65) {
			System.out.println("Senior Citizen");
		}
		else{
			System.out.println("Invalid");
		}
	}
}
