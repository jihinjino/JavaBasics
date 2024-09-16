package com.string;

public class StringCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="oranium";
		String ss ="";
		for(int i=0;i<str.length();i++) {
			
			if(i%2==0) {
				ss = ss+Character.toUpperCase(str.charAt(i));
			}
			else {
				ss=ss+str.charAt(i);
			}
	
		}
		System.out.println(ss);
		
	}

}
