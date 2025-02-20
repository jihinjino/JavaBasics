package com.recursion;

public class SumUsingRecursion {
	public static int sum(int a) {
		if(a==0) {
			return a;
		}
		return a+sum(a-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));
	}

}
