package com.binary;

public class nonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 3, 2, 4, 3, 5, 2};
		int result =0;
		for(int i:arr) {
			result = result^i;
//			System.out.println(result);
		}
		System.out.println(result);
	}

}
