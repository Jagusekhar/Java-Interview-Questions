package Java;

import java.util.Arrays;

public class sortarrayascending {

	public static void main(String[] args) {

		int[] arr = {99, 89, 51, 93, 44}; // Declare and initialize array with 5 integers

		Arrays.sort(arr); // Sort the array in ascending order (44, 51, 89, 93, 99)

		// Loop through the array to print each element
		for(int i = 0; i < arr.length; i++) { 
			System.out.println(arr[i]); // Print the current element
		}
	}
}