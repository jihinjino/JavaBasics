package NestedLoop;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) { //row 1
//			System.out.println("1");
			for(int j=1;j<=i;j++) {
				System.out.print("* ");  //column 1
			}
			System.out.println();
		}
	}

}
