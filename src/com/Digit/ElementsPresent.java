package com.Digit;

public class ElementsPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19344445;
		int arr[] = new int[10];
		arr[0] = 1;
		while(n>0) {
			int index = n%10; //
			arr[index] = index; //
			n = n/10;
		}
		for(int i=0;i<10;i++) {
			if(i==arr[i])
				System.out.println(arr[i]+" ");
			else
				System.err.println(i);
			
		}
	}

}
