package com.string;

public class VowelConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World";
		int vowels =0;
		int consonants =0;
		s =s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==' ') {
				continue;
			}
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				
				vowels++;
			}
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				consonants++;
			}
			
		}
		System.out.println("The no of vowels present in string: "+vowels);
		System.out.println("The no of consonants present in string: "+consonants);
			
			
		
		
	}

}
