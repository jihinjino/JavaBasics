package com.arrays;

public class PrintArray {

	public static void main(String[] args) {
		
		int array[] = {100,90,80,89,89};
		
		//for-loop
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		//while-loop
		int j=0;
		while(j<array.length) {
			System.out.print(array[j]+" ");
			j++;
		}
		System.out.println();
		
		//do-while
		int k=0;
		do {
			System.out.print(array[k]+" ");
			k++;
		}while(k<array.length);
		System.out.println();
		
		//for-each loop
		for(int arr:array) {
			System.out.print(arr+" ");
		}
	}

}
