package com.basics;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Mark: ");
		int a = sc.nextInt();
		if(a>90 && a<=100) {
			System.out.println("A+ Grade");
		}
		else if(a>80 && a<=90) {
			System.out.println("A Grade");
		}
		else if(a>70 && a<=80) {
			System.out.println("B+ Grade");
		}
		else if(a>60 && a<=70) {
			System.out.println("B Grade");
		}
		else if(a>50 && a<=60) {
			System.out.println("C+ Grade");
		}
		else if(a>=40 && a<=50) {
			System.out.println("C Grade");
		}
		else if(a<40) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Number");
		}
	}

}
