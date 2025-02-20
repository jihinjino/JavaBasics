package com.arrays;



public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array= {12,3,5,14,16};
		for(int i =0;i<array.length-1;i++) {
			int ascIndex=i;
		for(int j=i+1;j<array.length;j++) {
			if(array[j]<array[ascIndex]) {
				ascIndex=j;
			}
		}
		int temp=array[ascIndex];
		array[ascIndex]=array[i];
		array[i]=temp;
		}
		System.out.println("ascending order:");
		for(int num:array) {
			System.out.print(num + " ");
		}
		
		
		
		
	}

}
