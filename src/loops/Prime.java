package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		int j =0;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
					j=1;
			}
			else {
				j=0;
			}
		}
		if(j==1) {
			System.out.println("It is not a prime number");
		}
		else {
			System.out.println("It is a prime number");
		}
	}

}
