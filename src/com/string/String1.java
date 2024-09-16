package com.string;


public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 ="Hello";
		
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
