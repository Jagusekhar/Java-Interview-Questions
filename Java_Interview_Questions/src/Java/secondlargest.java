package Java;

import java.util.*;

public class secondlargest {
    public static void main(String[] args) {
        
    	int[] arr = {83,9,22,22,40};
        // Array of numbers
            
        int first = Integer.MIN_VALUE;
        // Variable to store the largest number
        // MIN_VALUE means the smallest possible integer (-2147483648)

        int second = Integer.MIN_VALUE;
        // Variable to store the second largest number

        for(int i=0; i<arr.length; i++)
        // Loop through each element in the array
        {
            if(arr[i] > first)
            // If current number is greater than the largest number
            {
                second = first;
                // The previous largest becomes the second largest

                first = arr[i];
                // Update the largest number
            } 
            else
            {
                if(arr[i] > second)
                // If current number is greater than the second largest
                {
                    second = arr[i];
                    // Update the second largest number
                }
            }
        }

        System.out.println(second);
        // Print the second largest number

        }
    }