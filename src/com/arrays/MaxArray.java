package com.arrays;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,10,77,99,152,3};
		int n=arr.length;
		int max = arr[0];
		int temp=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
		}
		System.out.println(max);
	}

}
