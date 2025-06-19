package com.methods;

import java.util.Arrays;

public class function_ex {
	public static int[] rotate(int arr[] , int n) {
		n = n%arr.length;
		for(int i =1 ; i<=n ;i++) {
			int start =0;
			int end = arr.length-1;
			while(start<=end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
//				start++;
				end--;
			}
		}
		return arr;
	}
	
	public static int[][] transpose(int arr[][]){
		int a[][] = new int[arr.length][arr[0].length];
		for(int i =0 ; i<arr.length ; i++) {
			for(int j =0 ; j<arr[i].length ; j++) {
				
				a[j][i] = arr[i][j];
			}
		}
		arr = a;
		return arr;
	}
	public static int[] reverse(int arr[]) {
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
	public static String reverse(String s) {
		String str = "";
		for(int i = s.length()-1; i>=0 ; i--) {
			str = str + s.charAt(i);
		}
		return str;
	}
	public static void main(String[] args) {
		String str = reverse("Hello");
		System.out.println(str);
		int arr[] = {1,2,3,4,5};
//		arr = reverse(arr);
		for(int i=0;i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		int a[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		a = transpose(a);
		for(int i =0 ; i < a.length ; i++) {
			for(int j =0; j<a[i].length ;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		arr = rotate(arr,12345678);
		System.out.println(Arrays.toString(arr));
	}
}
