package com.arrays;

import java.util.*;
class replace_array
{
  static void replace_elements(int arr[], int size)
  {
    int sum=0;
    for(int i=0;i<size;i++){
      sum = sum+arr[i];
    }
    for(int i=0;i<size;i++){
      arr[i]=sum-arr[i];
    }
    
  }
  public static void main(String[] args)
  {
    int ind,size;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0;ind<size;ind++)
    {
      arr[ind]=sc.nextInt();
    }
    replace_elements(arr,size);
    for(ind=0;ind<size;ind++)
    System.out.print(arr[ind]+" ");
  }
}