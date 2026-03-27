package Java;

public class Add_2space_between_words {
	public static void main(String[] args) {
		
		String str = "jagu sekhar";  
        // Input string
        
        str = str.replace(" ", "");  
        // Removes existing spaces → "jagusekhar"
        
        String result = "";  
        // Empty string to store final output
        
        for (int i = 0; i < str.length(); i++) {  
            // Loop through each character
            
            result += str.charAt(i);  
            // Add current character to result
            
            if ((i + 1) % 2 == 0) {  
                // Check if position is multiple of 2 (every 2 letters)
                
                result += " ";  
                // Add space after every 2 characters
            }
        }
        
        System.out.println(result.trim());  
        // Print result and remove extra space at end
    }
}