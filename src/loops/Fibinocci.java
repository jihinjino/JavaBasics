package loops;

import java.util.Scanner;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int first =0;
		int second = 1;
		int fib=0;
		System.out.print("The fibinocci series: "+first+" "+second);
		for(int i=1;i<n-1;i++) {
			fib =first+second; // 0+1 , 1+1 3
			first = second;  //first =1 1 2
			second =fib; //second = 1 2 3
			System.out.print(" "+fib);
		}
			
	}

}
