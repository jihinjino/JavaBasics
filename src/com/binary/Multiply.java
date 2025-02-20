package com.binary;

public class Multiply {
    static int multiply(int a, int b) {
        int result = 0; //5
        while (b > 0) { //5 2 1 
            if ((b & 1) == 1) // 
                result = result +a;//0+5 25
            System.out.println(result);
            a = a<<1; //10 10<<1 20 40
            b = b>>1;//2 2>>1 1 1>>1 0
        }
        return result;
    }
    public static void main(String[] args) {
        int a = 5, b = 5;
        System.out.println("Product: " + multiply(a, b));
    }
}