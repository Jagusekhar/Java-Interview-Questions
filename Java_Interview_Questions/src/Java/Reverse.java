package Java;

public class Reverse {



	public static void main(String[] args) {


		String str = "java";  // Original string

		String rev = "";  // Empty string to store reversed string

		for (int i = str.length()-1; i>=0; i--)  // Loop starts from last index and moves backward
		{

			rev = rev+str.charAt(i); // Add current character to rev
		}
		System.out.println(rev);

	}

}
