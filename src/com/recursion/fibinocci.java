package com.recursion;

public class fibinocci {
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		int a =fib(n-1)+fib(n-2);
		/*
		 * n=0 --> fib(0) --> 0
		 * n=1 --> fib(1) --> 1
		 * n=2 --> fib(1) + fib(0) --> 1+0
		 * n=3 --> fib(2) + fib(1) --> 1+ 1 == 2
		 * n=4 --> fib(3) + fib(2) --> 2+1 ==3
		 * n=5 --> fib(4) + fib(3) --> 3+2 == 5
		 */
		
//		System.out.print(a+" ");
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println(fib(n));
	}
}
