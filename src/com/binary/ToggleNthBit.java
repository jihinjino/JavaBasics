package com.binary;
import java.util.Scanner;

public class ToggleNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number =10;
        int n =5;
        
        int toggledNumber = number ^ (1 << n);

        System.out.println("Result after toggling the (n+1)th bit: " + toggledNumber);
    }
}
