package NestedLoop;

public class IOPattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {    
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) {
					
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
//				System.out.print(1);
			}
			System.out.println();
		}
	}

}
