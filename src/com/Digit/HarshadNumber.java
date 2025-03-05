package com.Digit;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original = n;
		int sum =0;
		while(n!=0) {
			int digit = n%10;
			sum+=digit;
			n=n/10;
		}if(original%sum==0) {
			System.out.println("Harshad number");
		}else {
			System.out.println("Not a harshad number");
		}
	}

}
