package Java; 
// Package declaration (optional, used to organize classes)

public class Reversewords { 
// Class declaration

    public static void main(String[] args) { 
    // Main method - program execution starts from here

        String str = "Happy Birthday"; 
        // Input string

        String[] word = str.split(" "); 
        // Split string into words using space
        // Output: ["Jagu", "Hari", "chandra", "sekhar"]

        String result = ""; 
        // To store final reversed words

        for (int i = 0; i < word.length; i++) { 
        // Loop through each word

            String words = word[i]; 
            // Get one word at a time
            // Example: "Jagu", then "Hari", etc.

            String rev = ""; 
            // To store reversed version of current word

            for (int j = words.length() - 1; j >= 0; j--) { 
            // Start from last character of word and move backward

                rev = rev + words.charAt(j); 
                // Add each character in reverse order
                // Example: "Jagu" → "ugaJ"
            }

            result = result + rev + " "; 
            // Add reversed word to result with space
        }

        System.out.println(result.trim()); 
        // Print final result
        // trim() removes extra space at end
    }
}
