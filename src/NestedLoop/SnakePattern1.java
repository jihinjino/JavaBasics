package NestedLoop;
import java.util.*;
public class SnakePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2==0) {
				System.out.print((num++)+" "); // 1 2 3 4 5
				}
				else{
					System.out.print((num--)+" ");
				}
			}
			if(i%2==0) {
				num+=n-1;
			}else {
				num+=n+1;
			}
			System.out.println();
		}
		
	}

}
