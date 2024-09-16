package com.springBuffer;

public class SpringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("Hii");
		sb.append("Hello");
		sb.setCharAt(1, 'H');
		System.out.println(sb.charAt(0));
		System.out.println(sb);
		sb.delete(0,1);
		System.out.println(sb);
		sb.deleteCharAt(5);
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.setLength(5);
		System.out.println(sb);
		sb.trimToSize();
		System.out.println(sb);
		
	}

}
