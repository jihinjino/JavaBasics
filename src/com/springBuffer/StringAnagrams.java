package com.springBuffer;

import java.util.Arrays;

public class StringAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="listen";
		String str2 ="silent";
		StringBuffer sb1 = new StringBuffer(str1);
		StringBuffer sb2 = new StringBuffer(str2);
		
		char[] ch1 =sb1.toString().toCharArray();
		char[] ch2 = sb2.toString().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if(Arrays.equals(ch1,ch2)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
