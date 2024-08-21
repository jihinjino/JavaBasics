package NestedLoop;

public class ReverseAlphabet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for(int i=5;i>0;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}

}
