package com.binary;

public class BitSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =20;
		while(b!=0) {
			int c = (~a)&b;
//			System.out.println(c);
			a = a^b;
			b =c<<1;
//			System.out.println(b);
		}
		System.out.println(a);
	}

}
