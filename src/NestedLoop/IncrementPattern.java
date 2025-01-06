package NestedLoop;

import java.util.Scanner;

public class IncrementPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(sum+" ");
				sum=sum+1;
			}
			System.out.println();
		}
	}

}
