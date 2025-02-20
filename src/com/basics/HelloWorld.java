package com.basics;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the value: ");
//		double a = sc.nextDouble();	
//		System.out.println("The value is: "+ a);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		System.out.println("The string is : "+str);
		String str1 = sc.nextLine();
		System.out.print("The string is : "+str1);
		int a = 10;
		int b = 5;
		System.out.println(a/b);
	}

}
