package Java;

public class MethodOverloading {

	int calculator(int a, int b) {   // Method 1: takes 2 integers
        return a + b;   // returns sum of a and b
    }

    double calculator(double a, double b, double c) {  
        // Method 2 (Overloaded): same name but 3 double parameters
        return a + b + c;   // returns sum of three values
    }

    public static void main(String[] args) {   // Main method (entry point)

    	MethodOverloading over = new MethodOverloading();  
        // Creating object to call non-static methods

        System.out.println(over.calculator(2, 3));  
        // Calls calculator(int, int)
        // Because inputs are integers → exact match
        // Output: 5

        System.out.println(over.calculator(2.0, 3.0, 5.0));  
        // Calls calculator(double, double, double)
        // Because inputs are double → exact match
        // Output: 10.0
    }
}
