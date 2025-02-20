package com.arrays;

import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int even =0;
		int odd =0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
