package com.springBuffer;

public class LongPalindromeSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ababa";
		StringBuffer sb = new StringBuffer(str);
		StringBuffer sb1 = new StringBuffer();
		int count =0;
		int index=0;
		while((index=sb.indexOf(str,index))!=-1) {
			count++;
			index = index+sb.length();
		}
		System.out.println(count);
	}

}
