package com.arrays;

import java.util.Scanner;

public class ArraysCountOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int oc =0;
		int tc =0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				oc++;
			}
			else {
				tc++;
			}
		}
		System.out.println(oc);
		System.out.println(tc);
	}

}
