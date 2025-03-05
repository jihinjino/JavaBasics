package com.Digit;

import java.util.*;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int digit = 0;
		int num =n;
//		digit =String.valueOf(n).length();
		while(num>0) {
			digit++;
			num= num/10;
		}
		int sum =0;
		int power=0;
		while(n>0) {
			
			power = (int) Math.pow(n%10, digit); //3,3
			System.out.println(power);
			sum = sum+power;
			n = n/10;
		}
		System.out.print(sum);
	}

}
