package com.methods;

public class StringParseInt {
	
	public static void ParseInt() {
		String s ="23";
		int sum=0;
		char ch;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			sum = sum+(ch-'0');
			System.out.println(sum);
//			sum= sum+Integer.parseInt(String.valueOf(ch));
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParseInt();
	}

}
