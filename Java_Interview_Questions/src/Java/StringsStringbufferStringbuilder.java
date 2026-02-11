package Java;

public class StringsStringbufferStringbuilder {

	public static void main(String[] args) {

		//Strings

		String s = "Hello";

		s = s+"world";

		System.out.println(s);

		//StringBuffer

		StringBuilder SB = new StringBuilder("Jagu");

		SB.append("Sekhar");

		System.out.println(SB);


		//StringBuilder

		StringBuilder SBB = new StringBuilder("Sekhar");
		SBB.append("Jagu");
		
		System.out.println(SBB);



	}

}
