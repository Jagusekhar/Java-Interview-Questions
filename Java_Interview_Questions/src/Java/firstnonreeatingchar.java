package Java;
import java.util.*;


public class firstnonreeatingchar {
	
	public static void main(String[] args) {
		
		  String str = "aaabbc";  
	        // Input string to process

	        HashMap<Character, Integer> map = new HashMap<>();  
	        // Create a HashMap to store each character and its frequency

	        // First loop: count the frequency of each character
	        for(int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);  
	            // Get the character at index i

	            if(map.containsKey(ch)) {  
	                // If character already exists in the map
	                map.put(ch, map.get(ch) + 1);  
	                // Increment its frequency by 1
	            } else {
	                map.put(ch, 1);  
	                // If character is new, add it with frequency 1
	            }
	        }

	        // Second loop: find the first non-repeating character(s)
	        for(int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);  
	            // Get the character at index i

	            if(map.get(ch) == 1) {  
	                // If frequency of character is 1, it is non-repeating
	                System.out.println(ch);  
	                // Print the character
	            }
	        }
	    }
	}