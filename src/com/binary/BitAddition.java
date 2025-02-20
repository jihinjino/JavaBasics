package com.binary;

public class BitAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =20;
		while(b!=0) {
			int c = ~a&b; // 0
			System.out.println("c: "+c);
			a = a^b; // 0 20
			System.out.println("a: "+a);
			b =c<<1; //20 0
			System.out.println(b);
		}
		System.out.println("The output is: "+a);
	}

}
