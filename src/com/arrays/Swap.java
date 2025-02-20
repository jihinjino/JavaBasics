package com.arrays;

import java.util.Scanner;
class Swap{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size ;i++){
      arr[i]=sc.nextInt();
    }
    int pos1 = sc.nextInt();
    int pos2 = sc.nextInt();
    int temp=0;
    if(pos1 >size || pos2 >size ||pos1<0 ||pos2<0){
      System.out.println("Invalid");
    }
    else{
      temp = arr[pos1];
      arr[pos1] = arr[pos2];
      arr[pos2] = temp;
      
    for(int i:arr){
      System.out.print(i+" ");
    }
    }

  }
}