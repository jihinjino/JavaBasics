package com.arrays;

public class Swap2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {5,4,3,2,1};
		int temp =0;
		for(int i=0;i<arr1.length;i++) {
				temp = arr1[i];
				arr1[i] = arr2[i]; //5
				arr2[i] =temp; //1
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int j=0;j<arr2.length;j++) {
			System.out.print(arr2[j]+" ");
		}
		
				
	}

}

