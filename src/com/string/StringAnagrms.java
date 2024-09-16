package com.string;

public class StringAnagrms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "silent";
		String str = "listen";
		int count =0;
		String ss ="";
		if(s.length()!=str.length()) {
			System.out.println("This is not a anagram");
		}
		else {
			for(int i=0;i<s.length();i++) {
				for(int j=0;j<s.length();j++) {
					if(s.charAt(i)==str.charAt(j)) {
						count++;
						ss= ss+str.charAt(j);
					}
				}
			}
			System.out.println(ss);
			if(s.equals(ss)) {
				System.out.println("This is Anagram");
			}
			else {
				System.out.println("This is not a Anagram");
			}
		}		
	}
}
