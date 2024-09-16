package com.string;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color: ");
		String color =sc.nextLine();
		if(color.equals("Red") ||color.equals("red")) {
			System.out.println("Stop");
		}
		else if(color.equals("Yellow") ||color.equals("yellow")) {
			System.out.println("Ready");
		}
		else if(color.equals("Green") || color.equals("green")) {
			System.out.println("GO!...");
		}
		else {
			System.out.println("Give the valid color!.");
		}
	}

}
