package com.arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
			
		}
		
	}

}
