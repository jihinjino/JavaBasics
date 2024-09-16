package com.string;

public class StringDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="123450";
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				count++;
			}
			
		}
		if(s.length()==count) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
