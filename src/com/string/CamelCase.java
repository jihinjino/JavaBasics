package com.string;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="java is fun";
		String str[] =s.split(" ");
		String ss="";
		
		for(int i=0;i<str.length;i++) {
			ss = ss+Character.toUpperCase(str[i].charAt(0));
			
			for(int j=1;j<str[i].length();j++) {
				ss=ss+str[i].charAt(j);
			}
			ss=ss+" ";
		}
		System.out.println(ss);
	}

}
