package com.recursion;

public class IntegerCount {
	static int count(int n) {
		if(n==0) {
			return n;
		}
		return 1+count(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5686983;
		System.out.println(count(n));
	}

}
