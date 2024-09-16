package com.string;

public class NoRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="swiss";
		
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(i-1)) {
				char ch=s.charAt(i);
				System.out.println(ch);
				break;
			}
		}
	}

}
