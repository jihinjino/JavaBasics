package com.Digit;

public class NarcistticNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int count =0;
		
		while(count<15) {
			int original =n;
			int sum =0;
			int l = String.valueOf(n).length();
			int temp =n;
			
			while(temp>0) {
				int digit = temp%10;
				sum+=Math.pow(digit, l);
				temp=temp/10;
			}
			if(sum==original) {
				System.out.println(n+" ");
				count++;
			}
			n++;
		}
		
	}

}
