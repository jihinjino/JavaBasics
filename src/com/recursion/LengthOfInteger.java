package com.recursion;

public class LengthOfInteger {
	
	public static int len(int num) {
		if(num==0) {
			return 0;
		} 
		return 1+len(num/10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(len(2222222));
	}

}
