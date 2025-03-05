package com.Digit;

public class WrongSumCorrectSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-1,2,-3,4,-5};
		
		int Wrongsum =0;
		for(int i:arr) {
			if(i<0) {
				Wrongsum = Wrongsum+(-(i));
			}else {
				Wrongsum = Wrongsum+i;
			}
		}
		System.out.println(Wrongsum);
		int correctSum =0;
		for(int i:arr) {
			correctSum = correctSum+i;
		}
		System.out.println(correctSum);

	}

}
