package NestedLoop;

public class NumPattern {
	public static void main(String args[]) {
		int n =5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0||j==n/2||j==n-1) {
					
					System.out.print("1");
				}
				else
					System.out.print("0");
			}
			System.out.println();
			
		}
	}
}
/*
 * 10101
 * 10101
 * 10101
 * 10101
 */