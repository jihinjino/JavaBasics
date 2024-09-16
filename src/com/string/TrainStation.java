package com.string;

import java.util.Scanner;

public class TrainStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Station name:");
	String s = sc.nextLine();
	System.out.print("Enter the Train type: ");
	String s1 =sc.nextLine();
	
	String station = "Local";

	
	if(s1.equals(station)) {
		System.out.println("The train will Stop at "+s);
	}
	else
		System.out.println("The Train will not Stop at this location");
	
	}

}
