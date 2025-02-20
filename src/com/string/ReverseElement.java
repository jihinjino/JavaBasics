//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
// 
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "aman




package com.string;
import java.util.Scanner;

public class ReverseElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		String str1="";
		String rev="";
		String str=s.toLowerCase();
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z'||str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				str1 = str1+str.charAt(i);
			}}
			System.out.println(str1);
			for(int i=str1.length()-1;i>=0;i--) {
				rev+=str1.charAt(i);
			}
			System.out.println(rev);
			if(rev.equals(str1)) {
				
				System.out.println("True");
			}else {
				System.out.println("False");

			}
		}
	}


