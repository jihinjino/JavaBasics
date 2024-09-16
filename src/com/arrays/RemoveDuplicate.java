package com.arrays;
import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int a[] = {1, 1, 5, 2, 2, 2, 3, 4};
        
        Arrays.sort(a);  // Sorting the array
        int n = a.length;
        
        // Print the first element (as it's always unique after sorting)
        System.out.print(a[0]);
        		
        // Start loop from the second element
        for (int i = 1; i < n; i++) {
            // Only print the element if it's different from the previous one
            if (a[i] != a[i - 1]) {
                System.out.print(" " + a[i]);
            }
        }
    }
}
