package com.springBuffer;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="ab";
		String sub ="ab";
		int count =0;
		int index =0;
		while((index=str.indexOf(sub,index))!=-1) {
			count++;
			index =index+sub.length();
			System.out.println(index);
		}
		System.out.println(count);
	}

}
