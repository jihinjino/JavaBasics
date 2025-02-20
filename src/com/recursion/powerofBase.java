package com.recursion;

public class powerofBase {
	
	public static int power1(int num1,int num2) {
		if(num2==0) {
			return 1;
		}
		return num1*power1(num1,num2-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base =5;
		int powerValue = 3;
		
		System.out.println(power1(base,powerValue));
		
	}

}
