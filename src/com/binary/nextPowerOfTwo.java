package com.binary;

import java.util.Scanner;

public class nextPowerOfTwo {

        
    public static void main(String[] args) {
    	int n=56;
    	int power = 1;
    	while (power <= n) {
    		power =power<<1;
//    		System.out.println(power);
    	}
        System.out.println(power);
    }
}
