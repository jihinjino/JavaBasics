package com.Digit;

public class NumbersPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234567;
		
		int arr[] = new int[10];
		arr[0] =1;
		
		while(n>0) {
			int digit = n%10;
			arr[digit] = n%10;
			n = n/10;
		}
		int count =0;
		for(int i =0;i<10;i++) {
			if(i==arr[i]) {
				System.out.println(arr[i]);
				count++;
			}else {
				System.err.println(i);
			}
		}
		if(count ==10) {
			System.out.println("All Elemnets are present");
		}else System.out.println("Some elements are missing");
	}

}
