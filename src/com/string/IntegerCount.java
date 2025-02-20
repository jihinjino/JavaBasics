package com.string;

public class IntegerCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 56781;
		String s = n+"";
		System.out.println(s.length());
		char c[] = s.toCharArray();
		System.out.println(c.length);
		int count =0;
		while(n>0) {
			n=n/10;
			count++;
		}
		Integer a =10;
		System.out.println(a);
		System.out.println(count);
		
	}

}
