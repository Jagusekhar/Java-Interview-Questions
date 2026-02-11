package Java;

public class Operandsandequals {

	public static void main(String[] args) {


		String str1 = new String("Jagu");
		String str2 = new String("Jagu");

		Boolean Operands=str1==str2;

		System.out.println("Result of ==:" +Operands);
		
		
		Boolean equalsmethod=str1.equals(str2);
		
		System.out.println("Result of equals:" +equalsmethod);






	}

}
