package loops;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		int n = s.length();
		String palindrome ="";
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			palindrome = ch+palindrome;
		}
		if(s.equals(palindrome)){
			System.out.println("It is a Palindrome");
		}
		else
			System.out.println("It is not a palindrome");
			
	}

}
