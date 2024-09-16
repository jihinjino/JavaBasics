package com.string;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Hii Everyone";
		String str[] = s.split(" ");
		String r ="";
		for(int i=0;i<str.length;i++) {
			int ch = str[i].length();
			for(int j=ch;j>0;j--) {
				r =r +str[i].charAt(j-1);
			}
			r = r+" ";
			}
			System.out.println(r);
		}

}

