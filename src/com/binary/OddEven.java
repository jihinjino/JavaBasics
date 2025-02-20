package com.binary;
public class OddEven {
    public static void main(String[] args) {
        int num = 8; 
        if((num & 1 )==0) {
        	System.out.println("Even");
        }
        else System.out.println("Odd");
    }
}