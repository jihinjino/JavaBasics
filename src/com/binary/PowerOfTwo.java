package com.binary;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		if(((n&(n-1))==0)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
