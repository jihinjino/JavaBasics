package com.methods;

class function1{
	public  void m1() {
		System.out.println("Hello");
	}
}

public class FunctionBasics {
	public static void m1() { // no arguments
		System.out.println("Hello");
	}
	public static void m1(int a) {
		System.out.println(a);
	}
	public static void m1(int a,int b) {
		System.out.println(a+" "+b);
	}
	public static void m1(String a) {
		System.out.println(a);
	}
	public  void m1(float a,int b) {
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		m1(); //hello
//		m1(10); //10
//		m1(10,20); //10 20
//		m1("Hii"); //
//		FunctionBasics fb = new FunctionBasics();
//		fb.m1(10f, 20);
////		function f1 = new function();
//		function1 f1 = new function1();
//		f1.m1();
		function s = new function();
		s.m1();
	}

}
