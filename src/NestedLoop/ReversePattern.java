package NestedLoop;

import java.util.Scanner;

public class ReversePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) { //1 2 3 4 5
			for(int j=n;j>=i;j--) { //
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
