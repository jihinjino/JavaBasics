package NestedLoop;

public class AlphabetReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int n=5;
		for(int i=n;i>0;i--) {
            // Print letters starting from the startLetter to 'E'
            for (int j = i; j <= n; j++) {
                System.out.print((char)(j+64));
            }
            System.out.println();
		}
	}

}
