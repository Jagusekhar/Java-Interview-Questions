package Java;

public class Alternatewords {

	public static void main(String[] args) {

		String name = "I am working in incedo best company";

		String[] words = name.split(" ");

		for (int i = 0; i<=words.length-1; i+=2)

		{

			System.out.print(words[i] + " ");
		}
	}

}
