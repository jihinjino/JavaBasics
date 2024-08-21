package NestedLoop;

public class ReverseAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=5;i>0;i--) {
			for(char ch='A';ch<'A'+i;ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}
