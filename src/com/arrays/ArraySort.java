package com.arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,1,200,5,7,8,34};
		
		int n = arr.length;
		int temp=0;
		for(int i=0;i<n;i++) { //0 
			for(int j=i;j<n;j++) {  // 3>1
//				int[] arr= {3,4,1,200,5,7,8,34};
				if(arr[i]>arr[j]) {
					
					temp=arr[i]; // 3
					System.out.print(temp); //3
					arr[i]=arr[j]; // 1
					System.out.print(arr[i]);
					arr[j]=temp; // 3  
					System.out.print(arr[j]);
					
					//1 4 3
				}
			}
			System.out.print(arr[i]+" ");
		}
//		System.out.println("\nSmallest second element: "+arr[1]);
	}

}
