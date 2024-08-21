package NestedLoop;

public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n/2&&j==n/2) {
					
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}
/* 
 * 11111
 * 11111
 * 11011
 * 11111
 * 11111
 * 
 */