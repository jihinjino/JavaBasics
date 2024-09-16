package com.methods;

public class Stringwords {
	
	public static void StringCount() {
		String s ="ss hii hello how are you?";
		String ss[] =s.split(" ");
		int count=0;
		for(String i:ss) {
			count++;
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCount();
	}

}
