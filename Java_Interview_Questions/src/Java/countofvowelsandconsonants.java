package Java;

public class countofvowelsandconsonants {
	public static void main(String[] args) {
		
		String str = "Jagu sekhar";  
        // Input string

        str = str.toLowerCase();  
        // Convert to lowercase → makes comparison easy (A == a)

        int vowels = 0;  
        int consonants = 0;  
        // Counters for vowels and consonants

        for(int i = 0; i < str.length(); i++)  
        // Loop through each character in string
        {
            char ch = str.charAt(i);  
            // Get character at index i

            if (ch >= 'a' && ch <= 'z')  
            // Check if character is alphabet (ignore spaces)
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')  
                // Check if character is vowel
                {
                    vowels++;  
                    // Increase vowel count
                }
                else
                {
                    consonants++;  
                    // If not vowel → it's consonant
                }
            }
        }

        System.out.println(vowels);  
        // Print total vowels

        System.out.println(consonants);  
        // Print total consonants
    }
}