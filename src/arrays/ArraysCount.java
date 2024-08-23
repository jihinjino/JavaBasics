package com.arrays;
import java.util.Arrays;

public class ArraysCount {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		int n = arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			int count =0;
			for(int j=i;j<n;j++) {
				if(arr[i]==arr[j]) {
					count = count+1;
				}
			}
			System.out.println("The number of counts of " + arr[i] + " = " + count); //5 
			i=i+(count-1);
			System.out.println(i);
		}
	}
}
