package com.Digit;

public class Kaprekars {
    public static void main(String[] args) {
        int n = 297;
        long pow = (long) n * n;
        
        int l = String.valueOf(pow).length();
        int divisor =0;
        if(l%2!=0) {
        	divisor = (int) Math.pow(10, (l + 1) / 2);
        }
        else {
        	divisor = (int)Math.pow(10, l/2);
        }
        int leftSum = (int) (pow / divisor);
        int rightSum = (int) (pow % divisor);
        
        System.out.println(leftSum + " "+ rightSum);
        
        if (leftSum + rightSum == n && rightSum != 0) {
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n + " is NOT a Kaprekar number.");
        }
    }
}
