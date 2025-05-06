package NestedLoop;

public class SnakePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int val =1;
		for(int i=0;i<n;i++) {
				for(int j=1;j<=n;j++) {
					if(i%2==0) {
						System.out.print(val+" ");
						val++;
					}else {
						System.out.print(val+" ");
						val--;
					}
				}
				System.out.println();
				if(i%2==0) {
					val = val+n-1;
				}else {
					val = val+n+1;
				}
		}
	}

}
