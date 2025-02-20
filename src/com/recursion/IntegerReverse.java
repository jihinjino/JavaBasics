package com.recursion;

public class IntegerReverse {
	
	public static int reverse(int n,int rev) {
		
		if(n==0)
		return rev;
		
		rev = rev*10 + n%10;
		return reverse(n/10,rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1234;
		int rev = 0;
		int result =reverse(n,rev);
		System.out.println(result);
	}

}
