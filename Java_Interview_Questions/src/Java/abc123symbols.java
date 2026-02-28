package Java; // Package declaration, optional, just organizing code

public class abc123symbols { // Class definition

	public static void main(String[] args) { // Main method starts

		// Input string containing letters, numbers, spaces, and symbols
		String str = "J@agu H@r1 ch@ndr@ sekh@r 445";

		// Counters for letters, numbers, and symbols
		int letter = 0;
		int number = 0;
		int symbol = 0;

		// Loop through every character in the string
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i); // Get the character at position i

			// Check if the character is a letter (A-Z or a-z)
			if (Character.isLetter(ch)) {
				letter++; // Increment letter counter
			} 
			// Check if the character is a digit (0-9)
			else if (Character.isDigit(ch)) {
				number++; // Increment number counter
			} 
			// If it is neither letter nor digit → symbol
			else {
				symbol++; // Increment symbol counter (includes spaces, @, etc.)
			}
		}

		// Print the results
		System.out.println(letter + " letter(s)"); // Total letters in the string
		System.out.println(number + " number(s)"); // Total numbers in the string
		System.out.println(symbol + " symbol(s)"); // Total symbols in the string
	}
}
