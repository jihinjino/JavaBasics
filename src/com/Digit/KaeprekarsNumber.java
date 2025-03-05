package com.Digit;

public class KaeprekarsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9;
		int square = n*n;
		int length = String.valueOf(square).length();
		int sum1 =0;
		int sum2=0;
//		if(length%2==0) {
//			sum1 = square%(int)Math.pow(10,length/2);
//			sum2 = square/(int)Math.pow(10,length/2);
//		}
//		else {
			sum1 = square%(int)Math.pow(10,(length+1)/2);
			sum2 = square/(int)Math.pow(10,(length+1)/2);
//		}
		if((sum1+sum2)==n) {
			System.out.println("Kaprekars Number");
		}
		else {
			System.out.println("Not a Kaprekars number");
		}
		
	}

}
