package com.Digit;

class Solution {
    public static int alternateDigitSum(int n) {
        int size = String.valueOf(n).length();
        // System.out.print(size); 111
        int arr[] = new int[size]; 
        while(n>0){ //
            arr[size-1] = n%10; //1 1
            n =n/10;
            size--;
        }
        int EvenSum=0;
        int OddSum =0;
        int count =0;
        for(int i:arr) {
        	if(count%2==0) {
        		EvenSum +=i;
        	}else {
        		OddSum+=i;
        	}
        	count++;
        }
        return EvenSum-OddSum;
    }
    public static void main(String args[]) {
    	int n = 541;
    	System.out.println(alternateDigitSum(n));
    }
}