package loops;

import java.util.Scanner;

public class VowelsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				c++;
			}
		}
		System.out.println("The number of vowels present in the string: " +c);
	}

}
