package com.arrays;

import java.util.*;
public class sum_of_right {
	  static void sum_of_right_side_ele(int arr[], int size)
	  {
		 int sum =0;
	    for(int i=0;i<size;i++) {
	    	sum  = sum+arr[i];
	    }
	    for(int i=0;i<size;i++) {
	    	sum = sum - arr[i];
	    	System.out.print(sum+" ");
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
	    sum_of_right_side_ele(arr,size);
	    
	}
}