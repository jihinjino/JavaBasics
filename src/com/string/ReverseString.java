package com.string;

public class ReverseString {
	public static void main(String args[]) {
		String s = "This is my String";
		String reverse ="";
		char c[] = s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		
		
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse+s.charAt(i);
		}
		System.out.print("\n"+reverse);
	}
}
