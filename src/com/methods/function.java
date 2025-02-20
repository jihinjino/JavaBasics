package com.methods;

public class function {
	
	public  static int m1() {
		System.out.println("Welcome");
		return 1;
	}
	public static void m1(int a) {
		System.out.println(a);
	}
	public static void m1(int a,int b) {
		System.out.println(a+b);
	}
	public static void m1(int a,double b) {
		int c =a;
		double d = b;
		
		System.out.println(c+d);
	}
	public static int m1(String a,int b) {
		System.out.println(a+b);
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub			
//		function s1 = new function();
//		System.out.println(m1());
//		m1(5);
		m1(5,5);
		m1(10,5.5d);
//		m1("Hello",5);
		
	}

}
