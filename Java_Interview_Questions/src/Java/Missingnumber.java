package Java;

public class Missingnumber {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5};  
		// Array where one number is missing (4 is missing)

		int n = 5;   
		// The numbers should be from 1 to 5

		int sum = 0;  
		// Variable to store the sum of array elements

		for(int i = 0; i < arr.length; i++)  
		// Loop through all elements in the array
		{
		    sum = sum + arr[i];  
		    // Add each array element to sum
		}

		// After loop sum = 1+2+3+5 = 11

		int expected = n * (n + 1) / 2;  
		// Formula to find sum of numbers from 1 to n
		// 5 * (5+1) / 2 = 5 * 6 / 2 = 15

		System.out.println(expected - sum);  
		// Subtract actual sum from expected sum
		// 15 - 11 = 4 (this is the missing number)
	}
	
}
