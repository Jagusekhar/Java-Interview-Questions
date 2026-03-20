package Java;

public class a1bc2de3ef27xyz67 {



		public static void main(String[] args) {   // Main method – execution starts here
	        
			String str = "1abc2de3ef27xyz67"; 
			// Input string that contains numbers and letters

			int sum = 0;   
			// This var	um

			int num = 0;   
			// This variable is used to build numbers like 27 or 67

			for(int i=0; i<str.length(); i++)  
			// Loop through each character in the string
			{
			    char ch = str.charAt(i);  
			    // Get one character at a time from the string

			    if(Character.isDigit(ch))  
			    // Check if the character is a number (0–9)
			    {
			        num = num * 10 + (ch - '0');  
			        // Convert character to number and build the number
			        // Example:
			        // '2' → num = 2
			        // next '7' → num = 2*10 + 7 = 27
			    }
			    else  
			    // If the character is a letter
			    {
			        sum = sum + num;  
			        // Add the number we built to the total sum

			        num = 0;  
			        // Reset num so we can build the next number
			    }
			}

			sum = sum + num;  
			// Add the last number (because loop may end with a digit)

			System.out.println(sum);  
			// Print the final sum
		}}