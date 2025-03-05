package com.Digit;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 890625;
		long number =n*n;
		int length = String.valueOf(n).length();
		long mod = number%(long)Math.pow(10, length);
		if(mod==n) {
			System.out.println("Automorphic number");
		}else {
			System.out.println("Not an Automorphic number");
		}
		
		
	}

}
