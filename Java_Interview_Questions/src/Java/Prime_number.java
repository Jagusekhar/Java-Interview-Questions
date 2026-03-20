package Java;

public class Prime_number {

	public static void main(String[] args) {

		 for(int num = 2; num <= 100; num++) {   // Loop numbers from 2 to 100

	            boolean isPrime = true;             // Assume number is prime

	            for(int i = 2; i < num; i++) {      // Check divisibility from 2 to num-1

	                if(num % i == 0) {              // If divisible
	                    isPrime = false;            // Not a prime number
	                    break;                      // Stop checking
	                }
	            }

	            if(isPrime) {                       // If no divisor found
	                System.out.print(num + " ");    // Print prime number
	            }
	        }
	    }
	}