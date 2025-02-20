package com.recursion;

public class FactorialRecursion {
	
	    public static int factorial(int n) {
	        if (n == 0) {  // Base case
	            return 1;
	        }
	        return n * factorial(n - 1);  // 5 *factorial(4)
	        
//	        return factorial(n-1) *n;
	        
	    }

	    public static void main(String[] args) {
	        int result = factorial(5);
	        System.out.println("Factorial of 5 is: " + result);  // Output: 120
	    }
}
