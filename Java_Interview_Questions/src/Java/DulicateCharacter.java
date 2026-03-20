package Java;

public class DulicateCharacter {
	
	 public static void main(String[] args) {
	        // Main method where program execution starts
	        
	        String str = "automation";
	        // A string variable storing the word "automation"
	        
	        char[] ch = str.toCharArray();
	        // Convert the string into a character array
	        // ch = ['a','u','t','o','m','a','t','i','o','n']
	        
	        for(int i=0; i<ch.length; i++)
	        // Outer loop → picks one character at a time
	        // i = 0 → 'a'
	        // i = 1 → 'u'
	        // i = 2 → 't'
	        // ...
	        {
	            for(int j=i+1; j<ch.length; j++)
	            // Inner loop → compares the current character with the next characters
	            // j starts from i+1 so we don't compare the same index
	            {
	                if(ch[i] == ch[j])
	                // Check if two characters are equal
	                // Example: 'a' == 'a'
	                {
	                    System.out.println(ch[i]);
	                    // If duplicate is found, print the character
	                }
	            }
	        }
	    }
	}