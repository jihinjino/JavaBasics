package com.methods;

public class SmallestNumberMethod {
	
	public static void firstNumber(float a) {
		System.out.print("The smallest value is: "+a);
	}
	public static void Second(float b) {
		System.out.println("The smallest value is: "+b);
	}
	public static void ThirdNumber(float c) {
		System.out.println("The samlles value is: "+c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		if(a<b && a<c) {
			firstNumber(a);
		}
		else if(b<a && b<c) {
			Second(b);
		}
		else {
			ThirdNumber(c);
		}
	}

}
