package com.methods;

public class function {
	public double median(int arr[]) {
		//2,5,8,10
		double d = 0;
		int n = arr.length;
		if(n%2==0) {
			int a = n/2;
			d = (double)(arr[a] + arr[a-1])/2;
			
		}
		else 
		{
			int  a = (n+1)/2;
			d = arr[a-1];
//			return (double)arr[a-1];
		}
		
		return d;
		
	}
	public int[] reverse(int arr[]) {
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
	public String reverse(String s) {
		String str ="";
		
		for(int i = s.length()-1; i>=0 ; i--) {
			str+= s.charAt(i);
		}
		return str;
	}
	
	public int add(int c,int d) {
		return c+d;
	}
	
	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		function fun = new function();
		int c = fun.add(a,b);
		System.out.println(c);
		
		String s = "hello"; //olleh
		String str = fun.reverse(s);
		System.out.println(str);
		int arr[] = {2,5,8,10,15,20};
		int rev[] = fun.reverse(arr);
		for(int i=0;i<rev.length ; i++) {
			System.out.print(rev[i]+" ");
		}
	}
}
