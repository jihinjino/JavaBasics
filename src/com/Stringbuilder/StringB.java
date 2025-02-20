package com.Stringbuilder;

public class StringB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial StringBuilder: " + sb);
        String s =" is awesome";
        sb.append(s);
//        System.out.println("After append: " + sb);
//        sb.insert(0,s);
//        System.out.println(sb);
//        
//        sb.replace(1, 5, s);
//        System.out.println(sb);
//        sb.delete(10, 50);
//        System.out.println(sb);
        int length = sb.length();
        System.out.println("Current length: " + length);
        sb.reverse();
        System.out.println(sb);
        char charAt5 = sb.charAt(5);
        System.out.println("Character at index 5: " + charAt5);
        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);
        
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);
        String s1= sb.toString();
        System.out.println(s1);
	}

}
