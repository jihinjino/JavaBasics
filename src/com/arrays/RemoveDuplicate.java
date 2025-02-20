package com.arrays;
import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int a[] = {1, 1,1, 5, 2, 2, 2, 3,3, 4};
        
        Arrays.sort(a);  // Sorting the array
        int n = a.length;
////        1 1 2 2 2 3 4 5
//        
//        // Print the first element (as it's always unique after sorting)
//        System.out.print(a[0]);
//        		
//        // Start loop from the second element
//        for (int i = 1; i < n; i++) {
//            // Only print the element if it's different from the previous one
//            if (a[i] != a[i - 1]) { //1 != 1
//                System.out.print(" " + a[i]);
//            }
//        }
        
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(a[i] == a[j]) {
        			System.out.print(a[j]+" ");     
        			break;
        			}
        	}
        }
    }
}
