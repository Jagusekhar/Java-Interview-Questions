package Java;

public class CountofA {

	public static void main(String[] args) {

		// Store the given string
		String name = "Jagu Hari chandra sekhar";
		String str = name.toUpperCase();

		// Variable to store count of 'A'
		int count = 0;
		// Get character at position i
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='A')
			{
				// If yes, increase count by 1
				count++;
			}
		}

		System.out.println(count);

	}

}
