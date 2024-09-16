package com.string;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Java is Powerfull";
		
		String str[] =s.split(" ");
		String ss = "";
        int max = 0;
		
		for(String word:str) {
			if(word.length()>max) {
				max= word.length();
				ss = word;
				
			}
		}
		System.out.println(ss);
	}

}
