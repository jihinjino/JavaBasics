package loops;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		if(n>1) {
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		}
		else {
			System.out.println("Invalid");
		}
	}

}
