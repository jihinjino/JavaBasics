package com.Digit;

import java.util.Arrays;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 15432;
		String s = a+"";
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		StringBuilder sb = new StringBuilder();
		for(char c:ch) {
			sb = sb.append(c);
		}
		System.out.println(sb.reverse());
		
		
	}

}
