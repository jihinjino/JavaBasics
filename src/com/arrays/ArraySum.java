package com.arrays;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the value of the array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		} // 1 2 3 4 5 
		int sum =5; //10
		for(int i=0;i<n;i++) {
			sum=sum+arr[i]; //15
		}
		System.out.println(sum/n);
		
	}

}
