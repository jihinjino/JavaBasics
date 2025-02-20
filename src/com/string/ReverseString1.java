package com.string;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"Madam","BOB","MAM","Hello","hii"};
//		String str[] = s.split(" ");
//		String r ="";
		for(String str:s) {
			str =str.toLowerCase();
			String s1 ="";
			for(int i=str.length()-1;i>=0;i--) {
				s1 = s1+str.charAt(i); //""+madam
			}
			if(str.equals(s1)) {
				System.out.println("This is palindrome: "+str);
			}else {
				System.out.println("This is not a palindrome: "+str);
			}
		}
		
//		for(int i=str.length-1;i>=0;i--) {
//			r = r+str[i]; //Easy very is Java
//			if(i>0) { //3>0
//				r =r+" "; //Easy very is 
//			}
//		}
//		System.out.println(r);
	}

}
