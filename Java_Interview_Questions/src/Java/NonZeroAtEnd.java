package Java;

import java.util.Arrays;

public class NonZeroAtEnd { // Class definition
    public static void main(String[] args) { // Main method starts

        int[] arr = {1, 0, 2, 0, 3}; // Input array

        int count = 0; // This keeps track of the position to place the next non-zero number

        // Step 1: Move non-zero numbers to the front
        for (int i = 0; i < arr.length; i++) { // Loop through each element
            if (arr[i] != 0) { // Check if the current element is not zero
                arr[count] = arr[i]; // Place non-zero element at the position 'count'
                count++; // Move 'count' to the next position
            }
        }

        // Step 2: Fill remaining positions with 0
        while (count < arr.length) { // From 'count' to end of array
            arr[count] = 0; // Fill zero
            count++; // Move to next position
        }

        // Step 3: Print the final array
        System.out.println(Arrays.toString(arr)); // Print array as string: [1, 2, 3, 0, 0]
    }
}