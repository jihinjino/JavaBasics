package com.recursion;

public class IntegerReverseRecursion {
	
	static int reverse(int n,int rev) {
		
		if(n==0) {
			return rev;
		}
		rev = rev*10+(n%10);
		return reverse(n/10,rev);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n = 45678;
	int rev =0;
	System.out.println(reverse(n,rev));
	}

}
