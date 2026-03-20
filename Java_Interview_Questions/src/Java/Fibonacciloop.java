package Java;

public class Fibonacciloop {
	
	public static void main(String[] args) {
		
			
			int n = 5;          // Number of Fibonacci values to print
			
			int first = 0;      // First number of Fibonacci series
			int second = 1;     // Second number of Fibonacci series
			
			// Fibonacci series starts like:
			// 0, 1, 1, 2, 3, 5, 8, 13, 21 ...
			
			for(int i = 0; i < n; i++)   // Loop runs 5 times (because n = 5)
			{
				int next = first + second;  
				// Add previous two numbers
				// 1st loop: 0 + 1 = 1
				// 2nd loop: 1 + 1 = 2
				// 3rd loop: 1 + 2 = 3
				// 4th loop: 2 + 3 = 5
				// 5th loop: 3 + 5 = 8
				
				first = second;  
				// Move second number to first
				// Example: first becomes 1
				
				second = next;   
				// Move next number to second
				// Example: second becomes 1 (then 2, then 3...)
				
				System.out.println(next);  
				// Print the new Fibonacci number
			}
		}
	}