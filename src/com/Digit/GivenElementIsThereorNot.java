package com.Digit;

public class GivenElementIsThereorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 142516;
		int target =1;
		while(n!=0) {
			int rem = n%10; // 6
			if(rem == target) {
				System.out.print("Element is there!.");
				return;
			}
			n=n/10;
		}
		System.out.println("Element not founfd!.");
	}

}
