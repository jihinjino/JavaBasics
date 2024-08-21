package com.arrays;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the values of array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int ar:arr)      //for each loop
		{
			System.out.print(ar+" ");
		}
	}

}
