package Java;

import java.util.HashMap;

public class Countoccurance {
	
	public static void main(String[] args) {
		
	    String str = "automation";  
	    // Input string
		
	    HashMap<Character, Integer> map = new HashMap<>();
	    // Key   → Character
	    // Value → Count of that character
		
	    for(int i = 0; i < str.length(); i++)  
	    // Loop through each character of string
	    {
		    char ch = str.charAt(i);  
		    // Get character at index i
			
		    if(map.containsKey(ch))  
		    {
			    // If character already exists in map
			    map.put(ch, map.get(ch) + 1);  
			    // Increase its count by 1
		    }
		    else
		    {
			    // If character appears first time
			    map.put(ch, 1);  
			    // Insert into map with count 1
		    }
	    }
	
	    System.out.println(map);  
	    // Print final result
	}
}
