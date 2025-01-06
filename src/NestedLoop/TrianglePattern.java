package NestedLoop;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for(int i=0;i<n;i++) { 					//0
			for(int j=n;j>=i;j--) {              //     
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
