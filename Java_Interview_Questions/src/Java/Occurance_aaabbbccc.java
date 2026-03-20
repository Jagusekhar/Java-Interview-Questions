package Java; 
// This tells Java that this class belongs to the package named "Java"

import java.util.HashMap;
// Importing HashMap class from Java util package
// HashMap is used to store data in key-value pairs

public class Occurance_aaabbbccc {
// Class name

    public static void main(String[] args) {
    // Main method – program execution starts from here

        String str = "aaabbbccc";   
        // Input string we want to analyze

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // Creating a HashMap
        // Key   → Character (a, b, c)
        // Value → Integer (count of that character)

        for(int i=0; i<str.length(); i++)
        // Loop through the string from index 0 to length-1
        {

            char ch = str.charAt(i);
            // Getting each character from the string
            // Example: a, a, a, b, b, b, c, c, c

            if(map.containsKey(ch))
            // Check if the character already exists in the map
            {

                map.put(ch, map.get(ch)+1);
                // If character already exists
                // get(ch) → current count
                // +1 → increase count
                // put() → update value
            }
            else
            {
                map.put(ch, 1);
                // If character appears for the first time
                // Add it to the map with count = 1
            }
        }

        for(char key : map.keySet())
        // Loop through all keys in the HashMap
        // keySet() returns all characters stored in map
        {

            System.out.print(key + ""+ map.get(key));
            // Print key and its count
            // Example output: a3 b3 c3 (without spaces)
        }

    }
}
