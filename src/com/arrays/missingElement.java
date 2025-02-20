package com.arrays;

import java.util.Arrays;

public class missingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,6,8,9,10};
		Arrays.sort(arr);
//	System.out.println(arr.length);
		for(int i=0;i<arr.length-1;i++) {//	System.out.println(arr[i]);
			int sum =0;
			for(int j=i+1;j<arr.length;j++) {
				sum = arr[i]+arr[j];
//		System.out.println(sum);
				break;
				}
			if(sum%2==0) {
				System.out.println(sum/2);
			}
			}		
	}
	}
