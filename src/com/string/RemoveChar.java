package com.string;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="hello";
		char ch ='l';
		String ss ="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=ch) {
				ss=ss+s.charAt(i);
			}
		}
		System.out.println(ss);
	}

}
