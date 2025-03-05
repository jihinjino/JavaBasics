package com.Digit;

import java.util.Scanner;

public class swap2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 44 356
		int length = String.valueOf(n).length();
//		int sum1=0;
//		int sum2=0;
//		int totalsum=0;
//		if(length%2==0) {
//			sum1 = n%(int)Math.pow(10,length/2);
//			sum2 = n/(int)Math.pow(10, length/2);
//		}else {
//			sum1 = n%(int)Math.pow(10, (length/2)+1);
//			sum2 = n/(int)Math.pow(10, (length/2)+1);
//		}
//		totalsum = sum1*(int)Math.pow(10, length/2)+sum2;
//		System.out.println(totalsum);
		String s = ""+n;
		String sum1 = s.substring(0,length/2);
		String sum2 = s.substring(length/2,length);
//		System.out.println(sum2+sum1);
		int a = Integer.parseInt(sum2+sum1);
		System.out.println(a);
	}

}
