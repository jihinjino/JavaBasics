package com.binary;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int count=0;
		while(n>0) {
			n = n &(n-1);
			count++;
		}
		System.out.println(count);
	}

}
