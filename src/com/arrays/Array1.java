package com.arrays;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n/2];
		int index =0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				arr[index] =i;
				index++;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		

	}

}
