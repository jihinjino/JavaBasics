package com.character;

import java.util.Scanner;

public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		char ch[] = new char[n];
		for(int i=0;i<n;i++) {
			ch[i] =sc.next().charAt(0);
		}
//		for(int i=0;i<n;i++) {
//			System.out.print(ch[i]+" ");
//		}
		for(char c:ch) {
			System.out.print(c+" ");
		}
	}

}
