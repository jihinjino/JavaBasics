package com.basics;

public class Palindrome {
	public static void main(String args[]) {
		int n=1234;
		int reverse=0; //4321
		int reminder =0; //
		while(n!=0) {
			reminder = n%10;  //1234 %10
			System.out.println("The rem is "+reminder); //4
			reverse = reverse *10 + reminder;  //0*10+4
			System.out.println("The reverse is "+reverse); //4
			n=n/10; //123
			System.out.println(n);
		}
		System.out.println(reverse);
	}

}
