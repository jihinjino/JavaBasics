package com.arrays;

import java.util.Scanner;

import java.util.Arrays;

public class ArraysBasic {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		// 4 3 2 5 6 7  
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
}
}


