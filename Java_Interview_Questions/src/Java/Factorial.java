package Java;

public class Factorial {

	public static void main(String[] args) {

		// Declare the number for which we want to find factorial
		int number = 3; // Example: 3! = 3 × 2 × 1
		
		// We start with 1 because factorial multiplication starts from 1
		int factorial = 1;

		//Loop from 1 to the given number
		// i will take values 1, 2, 3
		//num is an int variable, not an array.
		//So num.length is invalid — only arrays and strings have length.
		
		for (int i=1; i<=number; i++)
		{
			factorial=factorial*i; //Multiply current factorial value with i
		}
		System.out.println(factorial);

	}

	
}
