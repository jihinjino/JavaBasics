package com.arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {90,77,120,1,3};
		int n = arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]<arr[j]) {
					temp =arr[i];  
					arr[i]=arr[j]; 
					arr[j]=temp; 
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nThe second largest number in the array: "+arr[1]);
	}

}
