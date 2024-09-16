package com.basics;

public class Palindrome {
	public static void main(String args[]) {
		int n=1234;
		int reverse=0;
		int reminder =0;
		while(n!=0) {
			reminder = n%10;  //4
			reverse = reverse *10 + reminder;   //0+4
			n=n/10; //123
		}
		System.out.println(reverse);
	}

}
