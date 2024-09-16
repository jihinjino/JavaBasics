package com.arrays2d;

//import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int[][] arr = {{0,1,2,3},{4,5,6,7,5}};
		
//		System.out.println(arr[0][1]);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int a[]:arr) {
			for(int i:a) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
