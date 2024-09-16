package com.arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,1,200,5,7,8,34};
		
		int n = arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nSmallest second element: "+arr[1]);
	}

}
