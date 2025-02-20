package com.string;

public class ReverseStringInAString {

	public static String reverseWord(String s) {
		String[] words=s.split(" ");
		StringBuilder r=new StringBuilder();
		for(String word : words) {
			StringBuilder sb= new StringBuilder(word);
			r.append(sb.reverse()).append(" ");
		}
		return r.toString().trim();
}
	public static void main(String[]args) { 
		String original="Hello Hii How Are You";
		String reversed= reverseWord(original);
		System.out.println("Original: "+ original);
		System.out.println("Reversed: "+ reversed);
	}
	
}
