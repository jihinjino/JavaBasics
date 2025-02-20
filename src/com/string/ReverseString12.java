package com.string;

public class ReverseString12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Hello hi how are you";
		String str[] = s.split(" ");
		for(String st:str) {
			String s1=""; 
			for(int i=st.length()-1;i>=0;i--) {
				s1 = s1+st.charAt(i); // olleH ih woh
			}
			System.out.print(s1+" "); //olleH ih woh 
		}
		
	}

}
