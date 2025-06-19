package com.methods;

import java.util.*;
public class Matrx_sum {
	public static List list(int arr[][]) {
		List<Integer> ls = new ArrayList<>();
		for(int i = 0; i<arr.length ; i++) {
			for(int j =0 ; j<arr[i].length ; j++) {
				ls.add(arr[i][j]);
			}
		}
		return ls;
	}
	public static int[][] print_2d(int arr[][]) {
		return arr;
	}
	
	public static int max_sum(int arr[][]) {
		
		int ans =0;
		for(int i =0 ; i < arr.length ; i++ ) {
			int max_row = Integer.MIN_VALUE;
			int max_sum = 0;
			for(int j = 0 ; j<arr[0].length ; j++) {
				max_sum = max_sum + arr[i][j];
			}
			if(max_sum > max_row) max_row = max_sum; 
			
			int max_col = Integer.MIN_VALUE;
			int col_sum =0;
			for(int j = 0 ; j < arr.length ; j++ ) {
				col_sum = col_sum + arr[j][i];
			}
			if(col_sum > max_col) max_col = col_sum;
			
			ans = max_row + max_col;
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		
		int arr[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		
		int ans = Matrx_sum.max_sum(arr);
		System.out.println(ans);
		int ar[][] = print_2d(arr);
		List<Integer> ls = list(ar);
		System.out.println(ls);
	}

}
