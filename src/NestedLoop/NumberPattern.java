package NestedLoop;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		for(int i=n;i>0;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
