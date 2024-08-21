package com.basics;
import java.util.*;
public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}
	}

}
