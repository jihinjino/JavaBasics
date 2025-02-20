package com.recursion;

public class PrintNusingRecursion {
		static void fun(int n) 
		{ 
			if (n > 0) 
			{ 
			System.out.print(n + " "); 
			fun(n - 1); 
			} 
		} 
		public static void main(String[] args) 
		{ 
			int x = 3; 
			fun(x); 
		} 
		}
