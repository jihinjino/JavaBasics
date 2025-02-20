package com.string;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Hello";
		
		String str ="";
		for(int i =s.length()-1;i>=0;i--) {
			System.out.print(str+s.charAt(i));
		}
	}

}
