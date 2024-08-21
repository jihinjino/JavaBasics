package loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("The multiplication of"+n+": ");
		int i=1;
		do {
			System.out.println(i+" * "+n+" = "+(i*n));
			i++;
		}while(i<=10);
	}

}
