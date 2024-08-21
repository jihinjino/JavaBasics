package com.basics;
import java.util.*;
public class ifElse {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("It is Positive number");
		}
		else if(a<0) {
			System.out.println("It is a negative number");
		}
		else {
			System.out.println("Zero");
		}
	}
}
