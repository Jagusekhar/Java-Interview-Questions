package Java;

public class removeduplicatesstring {
	
public static void main(String[] args) {
	
	
	String str = "automation";  
    // The input string we want to process

    String result = "";  
    // An empty string to store characters without repetition

    for(int i = 0; i < str.length(); i++) {  
        // Loop through each character of the input string
        char ch = str.charAt(i);  
        // Get the character at index i

        if(result.indexOf(ch) == -1) {  
            // Check if the character is NOT already in the result string
            // indexOf returns -1 if the character is not found
            result += ch;  
            // If it's not in result, append it
        }
    }

    System.out.println(result);  
    // Print the final string containing only unique characters
}
}