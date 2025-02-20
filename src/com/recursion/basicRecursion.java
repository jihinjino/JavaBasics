package com.recursion;

public class basicRecursion {
	public static int  m1(int a) { //10 9 8 ...0
		
		if(a==0) {
			return a;
		}
		
		int b =m1(a-1); // --> recursive case
		System.out.println(a); // 1 2 3 4 5 
		return b; 
	}

	public static void main(String[] args) {
		
		System.out.println(m1(5));
	}

}
