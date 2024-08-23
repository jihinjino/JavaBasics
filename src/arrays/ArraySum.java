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
		}
		int sum =0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}

}
