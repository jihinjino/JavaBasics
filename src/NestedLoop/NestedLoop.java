package NestedLoop;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows and column: ");
		int n = sc.nextInt();
		
		for(int rows=1;rows<=n;rows++) {
			for(int column=1;column<=rows;column++) {
				System.out.print("* "); 
			}			
			System.out.println();
		}
	}

}
