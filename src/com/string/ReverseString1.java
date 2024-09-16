package com.string;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is very Easy";
		String str[] = s.split(" ");
		String r ="";
		
		for(int i=str.length-1;i>=0;i--) {
			r = r+str[i];
			if(i>0) {
				r =r+" ";
			}
		}
		System.out.println(r);
	}

}
